package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.printer.SinglePrint;

public class SinglePrintTest {

    @Test
    public void should_only_say_something_once() {
        final Printer inner = Mockito.mock(Printer.class);
        final Printer speakOncePrinter = new SinglePrint(inner);

        speakOncePrinter.print("coucou");
        speakOncePrinter.print("je parle une seule fois");

        Mockito.verify(inner).print("coucou");
        Mockito.verifyNoMoreInteractions(inner);
    }

    @Test
    public void should_only_say_something_once_unless_flushed() {
        final Printer inner = Mockito.mock(Printer.class);
        final SinglePrint speakOncePrinter = new SinglePrint(inner);

        speakOncePrinter.print("coucou");
        speakOncePrinter.print("je parle une seule fois");
        speakOncePrinter.flush();

        speakOncePrinter.print("je peux reparler");
        speakOncePrinter.print("mais toujours une seule fois");

        Mockito.verify(inner).print("coucou");
        Mockito.verify(inner).print("je peux reparler");
        Mockito.verifyNoMoreInteractions(inner);
    }
}

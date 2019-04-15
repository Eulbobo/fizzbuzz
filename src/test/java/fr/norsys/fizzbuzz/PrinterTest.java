package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.printer.SinglePrint;

public class PrinterTest {

    @Test
    public void should_only_say_something_once() {
        final Printer inner = Mockito.mock(Printer.class);
        final Printer speakOncePrinter = new SinglePrint(inner);

        speakOncePrinter.print("coucou");
        speakOncePrinter.print("je parle une seule fois");

        Mockito.verify(inner).print("coucou");
        Mockito.verifyNoMoreInteractions(inner);
    }
}

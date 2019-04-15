package fr.norsys.twist;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class BuzzTest {

    @Test
    public void should_not_do_anything_with_0() {
        final Printer print = Mockito.mock(Printer.class);
        final Modulo mod = new Buzz();

        mod.accept(0, print);

        Mockito.verifyZeroInteractions(print);
    }

    @Test
    public void should_apply_if_correct_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Modulo mod = new Buzz();

        mod.accept(5, print);

        Mockito.verify(print).print("buzz");
    }

    @Test
    public void should_apply_if_correct_other_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Modulo mod = new Buzz();

        mod.accept(10, print);

        Mockito.verify(print).print("buzz");
    }

    @Test
    public void should_not_apply_if_incorrect_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Modulo mod = new Buzz();

        mod.accept(2, print);

        Mockito.verify(print, Mockito.times(0)).print(Matchers.anyString());
    }

}

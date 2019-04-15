package fr.norsys.twist;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class ModuloTest {

    @Test
    public void should_not_do_anything_with_0() {
        final Printer print = Mockito.mock(Printer.class);
        final Writer operation = (s) -> {
            print.print("go !");
        };
        final Modulo mod = new Modulo(1, operation);

        mod.accept(0, print);

        Mockito.verifyZeroInteractions(print);
    }

    @Test
    public void should_not_do_anything_with_0_even_if_mod_0() {
        final Printer print = Mockito.mock(Printer.class);
        final Writer operation = (s) -> {
            print.print("go !");
        };
        final Modulo mod = new Modulo(0, operation);

        mod.accept(0, print);

        Mockito.verifyZeroInteractions(print);
    }

    @Test
    public void should_apply_if_correct_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Writer operation = (s) -> {
            print.print("go !");
        };
        final Modulo mod = new Modulo(3, operation);

        mod.accept(3, print);

        Mockito.verify(print).print("go !");
    }

    @Test
    public void should_not_apply_if_incorrect_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Writer operation = (s) -> {
            print.print("go !");
        };
        final Modulo mod = new Modulo(2, operation);

        mod.accept(3, print);

        Mockito.verify(print, Mockito.times(0)).print(Matchers.anyString());
    }

}

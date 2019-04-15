package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.modulo.MyModulo;

public class ModuloTest {

    @Test
    public void should_not_do_anything_with_0() {
        final Printer print = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            print.print("go !");
        };
        final Modulo mod = new MyModulo(1, operation);

        mod.applyIfModulo(0);

        Mockito.verifyZeroInteractions(print);
    }

    @Test
    public void should_not_do_anything_with_0_even_if_mod_0() {
        final Printer print = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            print.print("go !");
        };
        final Modulo mod = new MyModulo(0, operation);

        mod.applyIfModulo(0);

        Mockito.verifyZeroInteractions(print);
    }

    @Test
    public void should_apply_if_correct_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            print.print("go !");
        };
        final Modulo mod = new MyModulo(3, operation);

        mod.applyIfModulo(3);

        Mockito.verify(print).print("go !");
    }

    @Test
    public void should_not_apply_if_incorrect_modulo() {
        final Printer print = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            print.print("go !");
        };
        final Modulo mod = new MyModulo(2, operation);

        mod.applyIfModulo(3);

        Mockito.verify(print, Mockito.times(0)).print(Matchers.anyString());
    }

}

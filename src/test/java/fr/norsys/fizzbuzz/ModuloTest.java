package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.modulo.MyModulo;

public class ModuloTest {

    @Test
    @SuppressWarnings("unchecked")
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
    @SuppressWarnings("unchecked")
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
    @SuppressWarnings("unchecked")
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

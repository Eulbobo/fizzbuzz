package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Mockito;

public class FizzBuzzTest {

    @Test
    public void should_say_nothing_with_0() {
        final Printer printer = Mockito.mock(Printer.class);
        final FizzBuzz fizzbuzz = new MyFizzBuzz(printer);

        fizzbuzz.sayNumber(0);

        Mockito.verifyZeroInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_3() {
        final Printer printer = Mockito.mock(Printer.class);
        final FizzBuzz fizzbuzz = new MyFizzBuzz(printer);

        fizzbuzz.sayNumber(3);

        Mockito.verify(printer).print("fizz");
    }

    @Test
    public void should_say_buzz_with_5() {
        final Printer printer = Mockito.mock(Printer.class);
        final FizzBuzz fizzbuzz = new MyFizzBuzz(printer);

        fizzbuzz.sayNumber(5);

        Mockito.verify(printer).print("buzz");
    }
}

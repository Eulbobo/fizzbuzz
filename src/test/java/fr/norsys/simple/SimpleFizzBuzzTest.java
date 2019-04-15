package fr.norsys.simple;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Test;

public class SimpleFizzBuzzTest {

    @Test
    public void should_say_nothing_with_0() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(0);

        verifyZeroInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_3() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(3);

        verify(printer).print("fizz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_buzz_with_5() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(5);

        verify(printer).print("buzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizzbuzz_with_15() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(15);

        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_multiple_of_3() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(6);

        verify(printer).print("fizz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_buzz_with_multiple_of_5() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(10);

        verify(printer).print("buzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizzbuzz_with_multiple_of_15() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(30);

        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_buzz_fizzbuzz_when_saying_numbers_3_then_10_then_30() {
        final Printer printer = mock(Printer.class);

        final SimpleFizzBuzz fizzbuzz = new SimpleFizzBuzz(printer);

        fizzbuzz.sayNumber(3);
        fizzbuzz.sayNumber(10);
        fizzbuzz.sayNumber(30);

        verify(printer).print("fizz");
        verify(printer).print("buzz");
        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }
}

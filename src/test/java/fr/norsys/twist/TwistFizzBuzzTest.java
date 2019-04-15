package fr.norsys.twist;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

public class TwistFizzBuzzTest {

    @Test
    public void should_say_nothing_with_0() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(0, printer);

        verify(printer, times(0)).print("fizz");
        verify(printer, times(0)).print("buzz");
        verify(printer, times(0)).print("fizzbuzz");
    }

    @Test
    public void should_say_fizz_with_3() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(3, printer);

        verify(printer).print("fizz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_buzz_with_5() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(5, printer);

        verify(printer).print("buzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizzbuzz_with_15() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(15, printer);

        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_multiple_of_3() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(6, printer);

        verify(printer).print("fizz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_buzz_with_multiple_of_5() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(10, printer);

        verify(printer).print("buzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizzbuzz_with_multiple_of_15() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(30, printer);

        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_buzz_fizzbuzz_when_saying_numbers_3_then_10_then_30() {
        final Printer printer = mock(Printer.class);

        final Modulo fizz = new Modulo(3, (s) -> s.print("fizz"));
        final Modulo buzz = new Modulo(5, (s) -> s.print("buzz"));

        final TwistFizzBuzz fizzbuzz = new TwistFizzBuzz(fizz, buzz);

        fizzbuzz.sayNumberTo(3, printer);
        fizzbuzz.sayNumberTo(10, printer);
        fizzbuzz.sayNumberTo(30, printer);

        verify(printer).print("fizz");
        verify(printer).print("buzz");
        verify(printer).print("fizzbuzz");
        verifyNoMoreInteractions(printer);
    }
}

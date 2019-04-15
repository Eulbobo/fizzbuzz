package fr.norsys.fizzbuzz;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.modulo.BuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzBuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzOperation;
import fr.norsys.fizzbuzz.modulo.MyModulo;
import fr.norsys.fizzbuzz.teller.FizzBuzzTeller;

public class FizzBuzzTest {

    @Test
    public void should_say_nothing_with_0() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("fizz");
        };
        final Modulo modulo = new MyModulo(3, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(0);

        verifyZeroInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_3() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("fizz");
        };
        final Modulo modulo = new MyModulo(3, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(3);

        verify(printer).print("fizz");
    }

    @Test
    public void should_say_buzz_with_5() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("buzz");
        };
        final Modulo modulo = new MyModulo(5, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(5);

        verify(printer).print("buzz");
    }

    @Test
    public void should_say_fizz_with_multiple_of_3_only() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("fizz");
        };
        final Modulo modulo = new MyModulo(3, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(6);

        verify(printer).print("fizz");
    }

    @Test
    public void should_say_buzz_with_multiple_of_5_only() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("buzz");
        };
        final Modulo modulo = new MyModulo(5, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(10);

        verify(printer).print("buzz");
    }

    @Test
    public void should_say_fizzbuzz_with_multiple_of_15_only() {
        final Printer printer = Mockito.mock(Printer.class);
        final Operation operation = () -> {
            printer.print("fizzbuzz");
        };
        final Modulo modulo = new MyModulo(15, operation);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, modulo);

        fizzbuzz.sayNumber(15);

        verify(printer).print("fizzbuzz");
    }

    @Test
    public void should_say_fizzbuzz_with_multiple_of_15_only_and_all_elements() {
        final Printer printer = Mockito.mock(Printer.class);

        final Operation sayFizz = new FizzOperation(printer);
        final Operation sayBuzz = new BuzzOperation(printer);
        final Operation sayFizzbuzz = new FizzBuzzOperation(printer);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Teller fizzbuzz = new FizzBuzzTeller(this::noflush, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(15);

        verify(printer).print("fizzbuzz");
    }

    private void noflush() {
        // noflush
    }
}

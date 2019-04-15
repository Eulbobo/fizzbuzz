package fr.norsys.fizzbuzz;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.modulo.BuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzBuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzOperation;
import fr.norsys.fizzbuzz.modulo.MyModulo;
import fr.norsys.fizzbuzz.printer.SinglePrint;
import fr.norsys.fizzbuzz.teller.FizzBuzzTeller;

public class AllFizzBuzzTest {

    @Test
    public void should_say_fizzbuzz_with_multiple_of_15_only_and_all_elements() {
        final Printer printer = Mockito.mock(Printer.class);

        final SinglePrint single = new SinglePrint(printer);

        final Operation sayFizz = new FizzOperation(single);
        final Operation sayBuzz = new BuzzOperation(single);
        final Operation sayFizzbuzz = new FizzBuzzOperation(single);

        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Teller fizzbuzz = new FizzBuzzTeller(single, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(15);

        verify(printer).print("fizzbuzz");
        Mockito.verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_multiple_of_3_only_and_all_elements() {
        final Printer printer = Mockito.mock(Printer.class);

        final SinglePrint single = new SinglePrint(printer);

        final Operation sayFizz = new FizzOperation(single);
        final Operation sayBuzz = new BuzzOperation(single);
        final Operation sayFizzbuzz = new FizzBuzzOperation(single);

        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Teller fizzbuzz = new FizzBuzzTeller(single, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(9);

        verify(printer).print("fizz");
        Mockito.verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_say_fizz_with_multiple_of_5_only_and_all_elements() {
        final Printer printer = Mockito.mock(Printer.class);

        final SinglePrint single = new SinglePrint(printer);

        final Operation sayFizz = new FizzOperation(single);
        final Operation sayBuzz = new BuzzOperation(single);
        final Operation sayFizzbuzz = new FizzBuzzOperation(single);

        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Teller fizzbuzz = new FizzBuzzTeller(single, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(10);

        verify(printer).print("buzz");
        Mockito.verifyNoMoreInteractions(printer);
    }

    @Test
    public void should_work_multiple_times() {
        final Printer printer = Mockito.mock(Printer.class);

        final SinglePrint single = new SinglePrint(printer);

        final Operation sayFizz = new FizzOperation(single);
        final Operation sayBuzz = new BuzzOperation(single);
        final Operation sayFizzbuzz = new FizzBuzzOperation(single);

        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Teller fizzbuzz = new FizzBuzzTeller(single, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(10);
        fizzbuzz.sayNumber(5);
        fizzbuzz.sayNumber(15);

        verify(printer, times(2)).print("buzz");
        verify(printer).print("fizzbuzz");
        Mockito.verifyNoMoreInteractions(printer);
    }
}

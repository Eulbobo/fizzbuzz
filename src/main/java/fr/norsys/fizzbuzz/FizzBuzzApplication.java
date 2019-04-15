package fr.norsys.fizzbuzz;

import fr.norsys.fizzbuzz.modulo.BuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzBuzzOperation;
import fr.norsys.fizzbuzz.modulo.FizzOperation;
import fr.norsys.fizzbuzz.modulo.MyModulo;
import fr.norsys.fizzbuzz.printer.SinglePrint;
import fr.norsys.fizzbuzz.printer.SysOutPrinter;
import fr.norsys.fizzbuzz.teller.FizzBuzzTeller;

public class FizzBuzzApplication {

    public static void main(final String[] args) {

        final Printer sysout = new SysOutPrinter();
        final SinglePrint single = new SinglePrint(sysout);

        final Operation sayFizz = new FizzOperation(single);
        final Operation sayBuzz = new BuzzOperation(single);
        final Operation sayFizzbuzz = new FizzBuzzOperation(single);

        final Modulo moduloFizzBuzz = new MyModulo(15, sayFizzbuzz);
        final Modulo moduloBuzz = new MyModulo(5, sayBuzz);
        final Modulo moduloFizz = new MyModulo(3, sayFizz);
        final Teller fizzbuzz = new FizzBuzzTeller(single, moduloFizzBuzz, moduloFizz, moduloBuzz);

        fizzbuzz.sayNumber(0); // rien
        fizzbuzz.sayNumber(3); // fizz
        fizzbuzz.sayNumber(5); // buzz
        fizzbuzz.sayNumber(9); // fizz

        fizzbuzz.sayNumber(15); // fizzbuzz

        for (int i = 0; i < 20; i++) {
            sysout.print(" >> " + i);
            fizzbuzz.sayNumber(i);
        }

    }

}

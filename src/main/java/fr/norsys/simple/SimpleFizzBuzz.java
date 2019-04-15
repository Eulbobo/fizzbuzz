package fr.norsys.simple;

import java.io.PrintStream;

public class SimpleFizzBuzz {

    public static class Printer {
        PrintStream writer;

        Printer(final PrintStream writer) {
            this.writer = writer;
        }

        public void print(final String value) {
            if (value.length() > 0) {
                writer.println(value);
            }
        }
    }

    Printer printer;

    public SimpleFizzBuzz(final Printer printer) {
        this.printer = printer;
    }

    public void sayNumber(final int value) {
        final StringBuilder sb = new StringBuilder();
        if (value > 0) {
            if (value % 3 == 0) {
                sb.append("fizz");
            }
            if (value % 5 == 0) {
                sb.append("buzz");
            }

            printer.print(sb.toString());
        }
    }

    public static void main(final String[] args) {
        final Printer printToLog = new Printer(System.out);
        final SimpleFizzBuzz fizzBuzz = new SimpleFizzBuzz(printToLog);
        fizzBuzz.sayNumber(0);
        fizzBuzz.sayNumber(1);
        fizzBuzz.sayNumber(15); // fizzbuzz
        fizzBuzz.sayNumber(3); // fizz
        fizzBuzz.sayNumber(5); // buzz
    }

}

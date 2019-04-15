package fr.norsys.fizzbuzz;

public class MyFizzBuzz implements FizzBuzz {

    private final Printer printer;

    public MyFizzBuzz(final Printer printer) {
        this.printer = printer;
    }

    @Override
    public void sayNumber(final int number) {
        if (number == 3) {
            printer.print("fizz");
        }
        if (number == 5) {
            printer.print("buzz");
        }

    }

}

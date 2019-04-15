package fr.norsys.fizzbuzz.modulo;

import fr.norsys.fizzbuzz.Operation;
import fr.norsys.fizzbuzz.Printer;

public class FizzBuzzOperation implements Operation {

    private final Printer printer;

    public FizzBuzzOperation(final Printer printer) {
        this.printer = printer;
    }

    @Override
    public void apply() {
        printer.print("fizzbuzz");
    }

}

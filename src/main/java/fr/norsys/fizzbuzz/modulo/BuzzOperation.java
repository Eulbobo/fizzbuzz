package fr.norsys.fizzbuzz.modulo;

import fr.norsys.fizzbuzz.Operation;
import fr.norsys.fizzbuzz.Printer;

public class BuzzOperation implements Operation {

    private final Printer printer;

    public BuzzOperation(final Printer printer) {
        this.printer = printer;
    }

    @Override
    public void apply() {
        printer.print("buzz");
    }

}

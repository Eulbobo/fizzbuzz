package fr.norsys.fizzbuzz.printer;

import fr.norsys.fizzbuzz.Flushable;
import fr.norsys.fizzbuzz.Printer;

public class SinglePrint implements Printer, Flushable {

    private final Printer innerPrinter;

    private boolean spoke;

    public SinglePrint(final Printer printer) {
        innerPrinter = printer;
    }

    @Override
    public void print(final String value) {
        if (!spoke) {
            innerPrinter.print(value);
            spoke = true;
        }
    }

    @Override
    public void flush() {
        spoke = false;
    }

}

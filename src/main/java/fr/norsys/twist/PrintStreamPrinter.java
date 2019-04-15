package fr.norsys.twist;

import java.io.PrintStream;

class PrintStreamPrinter implements Printer {

    private final PrintStream writer;

    PrintStreamPrinter(final PrintStream writer) {
        this.writer = writer;
    }

    public void print(final String value) {
        if (value.length() > 0) {
            writer.println(value);
        }
    }
}

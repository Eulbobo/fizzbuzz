package fr.norsys.fizzbuzz.printer;

import fr.norsys.fizzbuzz.Printer;

public class SysOutPrinter implements Printer {

    @Override
    public void print(final String value) {
        System.out.println(value);
    }

}

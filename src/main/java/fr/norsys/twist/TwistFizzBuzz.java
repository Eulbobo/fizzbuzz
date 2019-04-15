package fr.norsys.twist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwistFizzBuzz {

    private final List<Twist> operations = new ArrayList<>();

    TwistFizzBuzz(final Twist... operations) {
        this.operations.addAll(Arrays.asList(operations));
    }

    public void sayNumberTo(final Integer value, final Printer printer) {
        final StringBuilder sb = new StringBuilder();
        final Printer bufferedPrinter = (s) -> sb.append(s);
        operations.forEach((o) -> o.accept(value, bufferedPrinter));
        printer.print(sb.toString());
    }

}

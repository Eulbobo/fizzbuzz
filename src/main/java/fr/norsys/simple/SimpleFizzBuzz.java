package fr.norsys.simple;

class SimpleFizzBuzz {

    private final Printer printer;

    SimpleFizzBuzz(final Printer printer) {
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

}

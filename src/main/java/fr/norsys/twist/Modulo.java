package fr.norsys.twist;

class Modulo implements Twist {

    private final int mod;
    private final Writer operation;

    public Modulo(final int mod, final Writer operation) {
        this.mod = mod;
        this.operation = operation;
    }

    @Override
    public void accept(final Integer value, final Printer printer) {
        if (value.intValue() > 0 && value.intValue() % mod == 0) {
            operation.writeTo(printer);
        }
    }
}
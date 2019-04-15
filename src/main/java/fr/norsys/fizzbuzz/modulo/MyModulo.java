package fr.norsys.fizzbuzz.modulo;

import fr.norsys.fizzbuzz.Modulo;
import fr.norsys.fizzbuzz.Operation;

public class MyModulo implements Modulo {

    private final int checkValue;

    private final Operation operation;

    public MyModulo(final int value, final Operation operation) {
        this.checkValue = value;
        this.operation = operation;
    }

    @Override
    public void applyIfModulo(final int number) {
        if (number > 0 && number % checkValue == 0) {
            operation.apply();
        }
    }

}

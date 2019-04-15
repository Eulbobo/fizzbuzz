package fr.norsys.fizzbuzz.teller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.norsys.fizzbuzz.Flushable;
import fr.norsys.fizzbuzz.Modulo;
import fr.norsys.fizzbuzz.Teller;

public class FizzBuzzTeller implements Teller {

    private final List<Modulo> modulos = new ArrayList<>();

    private final Flushable flush;

    public FizzBuzzTeller(final Flushable flush, final Modulo... modulos) {
        this.modulos.addAll(Arrays.asList(modulos));
        this.flush = flush;
    }

    @Override
    public void sayNumber(final int number) {
        modulos.stream().forEach((mod) -> mod.applyIfModulo(number));
        flush.flush();
    }

}

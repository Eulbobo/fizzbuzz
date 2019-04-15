package fr.norsys.fizzbuzz.brain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.norsys.fizzbuzz.Brain;
import fr.norsys.fizzbuzz.Child;

public class CompositeBrain implements Brain {

    private final List<Brain> brainElements = new ArrayList<>();

    public CompositeBrain(final Brain... brains) {
        brainElements.addAll(Arrays.asList(brains));
    }

    @Override
    public void childHasNumber(final Child child, final int number) {
        brainElements.forEach((brain) -> brain.childHasNumber(child, number));
    }

}

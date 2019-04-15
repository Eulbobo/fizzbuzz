package fr.norsys.fizzbuzz.brain;

import fr.norsys.fizzbuzz.Brain;
import fr.norsys.fizzbuzz.Child;

public class Fizz implements Brain {

    @Override
    public void childHasNumber(final Child child, final int number) {
        if (number % 3 == 0) {
            child.youCanSayFizz();
        }
    }

}

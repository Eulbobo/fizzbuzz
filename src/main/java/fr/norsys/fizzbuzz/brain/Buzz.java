package fr.norsys.fizzbuzz.brain;

import fr.norsys.fizzbuzz.Brain;
import fr.norsys.fizzbuzz.Child;

public class Buzz implements Brain {

    @Override
    public void childHasNumber(final Child child, final int number) {
        if (number > 0 && number % 5 == 0) {
            child.youCanSayBuzz();
        }

    }

}

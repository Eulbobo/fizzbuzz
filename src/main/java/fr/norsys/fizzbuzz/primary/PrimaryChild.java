package fr.norsys.fizzbuzz.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.norsys.fizzbuzz.Brain;
import fr.norsys.fizzbuzz.Child;
import fr.norsys.fizzbuzz.Room;

public class PrimaryChild implements Child {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrimaryChild.class);

    private final Room room;
    private final Brain brain;

    public PrimaryChild(final Room pRoom, final Brain pBrain) {
        this.room = pRoom;
        this.brain = pBrain;
    }

    @Override
    public void teacherSaysNumber(final int number) {
        LOGGER.info("il a dit {}", number);
        brain.childHasNumber(this, number);
    }

    @Override
    public void youCanSayFizz() {
        room.fizz();
    }

    @Override
    public void youCanSayBuzz() {
        room.buzz();
    }

    @Override
    public void youCanSayFizzBuzz() {
        room.fizzbuzz();
    }

}

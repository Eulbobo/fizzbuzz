package fr.norsys.fizzbuzz;

import fr.norsys.fizzbuzz.primary.PrimaryChild;
import fr.norsys.fizzbuzz.room.SysoutRoom;

public class FizzBuzzApplication {

    public static void main(final String[] args) {

        final Child child = new PrimaryChild(new SysoutRoom(),null);

        child.teacherSaysNumber(0);
        child.teacherSaysNumber(15);
        child.teacherSaysNumber(3);

    }

}

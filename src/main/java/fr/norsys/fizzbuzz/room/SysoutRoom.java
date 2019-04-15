package fr.norsys.fizzbuzz.room;

import fr.norsys.fizzbuzz.Room;

public class SysoutRoom implements Room {

    @Override
    public void fizz() {
        System.out.println("fizz");
    }

    @Override
    public void buzz() {
        System.out.println("buzz");
    }

    @Override
    public void fizzbuzz() {
        System.out.println("fizzbuzz");
    }

}

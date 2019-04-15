package fr.norsys.fizzbuzz;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.primary.PrimaryChild;

public class ChildTest {

    @Test
    public void should_say_nothing_when_brain_does_not_tell_you_to_say_anything() {
        final Room room = Mockito.mock(Room.class);
        final Brain brain = Mockito.mock(Brain.class);
        final Child child = new PrimaryChild(room, brain);

        child.teacherSaysNumber(456);

        verifyZeroInteractions(room);
    }

    @Test
    public void should_say_fizz_when_brain_tells_him_to() {
        final Room room = Mockito.mock(Room.class);
        final Brain brain = (child, number) -> {
            child.youCanSayFizz();
        };
        final Child child = new PrimaryChild(room, brain);

        child.teacherSaysNumber(456);

        verify(room).fizz();
        verifyNoMoreInteractions(room);
    }

    @Test
    public void should_say_buzz_when_brain_tells_him_to() {
        final Room room = Mockito.mock(Room.class);
        final Brain brain = (child, number) -> {
            child.youCanSayBuzz();
        };
        final Child child = new PrimaryChild(room, brain);

        child.teacherSaysNumber(456);

        verify(room).buzz();
        verifyNoMoreInteractions(room);
    }

    @Test
    public void should_say_fizzbuzz_when_brain_tells_him_to() {
        final Room room = Mockito.mock(Room.class);
        final Brain brain = (child, number) -> {
            child.youCanSayFizzBuzz();
        };
        final Child child = new PrimaryChild(room, brain);

        child.teacherSaysNumber(456);

        verify(room).fizzbuzz();
        verifyNoMoreInteractions(room);
    }
}

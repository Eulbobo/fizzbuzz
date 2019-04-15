package fr.norsys.fizzbuzz;

import org.junit.Test;
import org.mockito.Mockito;

import fr.norsys.fizzbuzz.brain.CompositeBrain;
import fr.norsys.fizzbuzz.brain.Fizz;

public class BrainTest {

    @Test
    public void should_do_nothing_when_number_is_0() {
        final Child child = Mockito.mock(Child.class);
        final Brain brain = new CompositeBrain();

        brain.childHasNumber(child, 0);

        Mockito.verifyZeroInteractions(child);
    }

    @Test
    public void fizz_should_ask_child_to_fizz_when_number_is_3() {
        final Child child = Mockito.mock(Child.class);
        final Brain brain = new Fizz();

        brain.childHasNumber(child, 3);

        Mockito.verify(child).youCanSayFizz();
    }

    @Test
    public void fizz_should_ask_child_to_fizz_when_number_is_6() {
        final Child child = Mockito.mock(Child.class);
        final Brain brain = new Fizz();

        brain.childHasNumber(child, 6);

        Mockito.verify(child).youCanSayFizz();
    }

    @Test
    public void fizz_should_should_do_nothing_with_0() {
        final Child child = Mockito.mock(Child.class);
        final Brain brain = new Fizz();

        brain.childHasNumber(child, 0);

        Mockito.verifyZeroInteractions(child);
    }
}

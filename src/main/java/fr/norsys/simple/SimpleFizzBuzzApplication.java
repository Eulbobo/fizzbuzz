package fr.norsys.simple;

public class SimpleFizzBuzzApplication {

    public static void main(final String[] args) {
        final SimpleFizzBuzz fizzBuzz = new SimpleFizzBuzz(new PrintStreamPrinter(System.out));
        fizzBuzz.sayNumber(0);
        fizzBuzz.sayNumber(1);
        fizzBuzz.sayNumber(15); // fizzbuzz
        fizzBuzz.sayNumber(3); // fizz
        fizzBuzz.sayNumber(5); // buzz
    }
}

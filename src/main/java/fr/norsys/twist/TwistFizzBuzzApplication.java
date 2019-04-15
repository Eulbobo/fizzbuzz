package fr.norsys.twist;

public class TwistFizzBuzzApplication {

    public static void main(final String[] args) {
        final Printer print = new PrintStreamPrinter(System.out);

        final TwistFizzBuzz fizzBuzz = new TwistFizzBuzz(new Fizz(), new Buzz());

        fizzBuzz.sayNumberTo(0, print);
        fizzBuzz.sayNumberTo(1, print);
        fizzBuzz.sayNumberTo(15, print); // fizzbuzz
        fizzBuzz.sayNumberTo(3, print); // fizz
        fizzBuzz.sayNumberTo(5, print); // buzz
    }
}

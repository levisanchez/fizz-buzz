package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {

    for (int counter = 0; counter <= 100; counter++) {
      //  - Check whether the current counter value is fizz, buzz, or both.
      boolean counterIsFizz = (counter % 3 == 0);
      boolean counterIsBuzz = (counter % 5 == 0);

      // TODO Print the number, or fizz, or buzz, or fizzbuzz, as appropriate
      // If counterIsFizz and counterIsBuzz, print fizzbuzz;
      // otherwise, if counterIsFizz, then print fizz;
      // otherwise, if counterIsBuzz, then print buzz;
      if (counterIsFizz && counterIsBuzz) {
        System.out.println("fizzbuzz");

      } else if (counterIsFizz) {
        System.out.println("fizz");
      } else if (counterIsBuzz) {
        System.out.println("buzz");
      } else {
        System.out.println(counter);
      }

    }
  }

}


package edu.wctc.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }
    }
}

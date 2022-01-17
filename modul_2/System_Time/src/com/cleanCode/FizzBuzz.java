package com.cleanCode;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isBuzz && isBuzz)
            return "FizzBuzz";

        if (isBuzz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }
}

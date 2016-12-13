package com.thoughtworks.FizzBuzz;

/**
 * Created by jjnzhang on 12/14/16.
 */
public class Core {
    public String convertToNumberDescription(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return "";
    }
}

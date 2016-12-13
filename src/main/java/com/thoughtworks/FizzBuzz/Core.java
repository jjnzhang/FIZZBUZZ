package com.thoughtworks.FizzBuzz;

/**
 * Created by jjnzhang on 12/14/16.
 */
public class Core {
    public static void main(String[] args) {
        int max = 100;
        Core core = new Core();
        Convert convert = new Convert(core);
        String[] numberDescriptions = convert.convertToNumberDescriptions(max);

        for (String numberDescription : numberDescriptions) {
            System.out.println(numberDescription);
        }
    }

    public String convertToNumberDescription(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return "" + number;
    }
}

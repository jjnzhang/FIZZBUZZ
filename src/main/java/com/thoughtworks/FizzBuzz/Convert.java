package com.thoughtworks.FizzBuzz;

/**
 * Created by jjnzhang on 12/14/16.
 */
public class Convert {
    private Core core;

    public Convert(Core core) {

        this.core = core;
    }


    public String[] convertToNumberDescriptions(int max) {
        String[] result = new String[max];
        for (int index = 0; index < max; index++) {
            result[index] =
                    core.convertToNumberDescription(index + 1);
        }

        return result;
    }
}

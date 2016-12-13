package com.thoughtworks.FizzBuzz;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by jjnzhang on 12/14/16.
 */
public class ConvertTest {
    @Test
    public void should_return_empty_given_0() {
        //given
        int max = 0;

        //when
        Core core = mock(Core.class);

        String[] numberDescriptions = new Convert(core).convertToNumberDescriptions(max);

        //then
        assertThat(numberDescriptions.length).isEqualTo(0);
    }
}


package com.thoughtworks.FizzBuzz;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    public void should_return_length_1_array_given_1() {
        //given
        int max = 1;

        //when
        Core core = mock(Core.class);
        when(core.convertToNumberDescription(1)).thenReturn("1");

        String[] numberDescriptions = new Convert(core).convertToNumberDescriptions(max);

        //then
        assertThat(numberDescriptions.length).isEqualTo(1);
        assertThat(numberDescriptions[0]).isEqualTo("1");
    }
}


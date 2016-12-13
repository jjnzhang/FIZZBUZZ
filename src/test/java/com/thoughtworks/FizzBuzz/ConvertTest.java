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

    @Test
    public void should_return_length_3_array_given_3() {
        int max = 3;

        //when
        Core core = mock(Core.class);
        when(core.convertToNumberDescription(1)).thenReturn("1");
        when(core.convertToNumberDescription(2)).thenReturn("2");
        when(core.convertToNumberDescription(3)).thenReturn("Fizz");

        String[] numberDescriptions = new Convert(core).convertToNumberDescriptions(max);

        //then
        assertThat(numberDescriptions.length).isEqualTo(3);
        assertThat(numberDescriptions[0]).isEqualTo("1");
        assertThat(numberDescriptions[1]).isEqualTo("2");
        assertThat(numberDescriptions[2]).isEqualTo("Fizz");
    }
}


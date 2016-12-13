import com.thoughtworks.FizzBuzz.Core;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by jjnzhang on 12/14/16.
 */
public class CoreTest {
    @Test
    public void should_return_Fizz_given_3() {
        //given
        int number = 3;

        //when
        String actualValue = new Core().convertToNumberDescription(number);

        //then
        assertThat(actualValue).isEqualTo("Fizz");
    }
}
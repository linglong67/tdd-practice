package calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelimiterTest {

    @Test
    void split_with_default_delimeter() {
        Delimiter delimiter = new Delimiter();
        List<String> result = delimiter.split("1:2,3:4");

        assertEquals(Arrays.asList("1", "2", "3", "4"), result);
    }

    @Test
    void split_with_custom_delimeter() {
        Delimiter delimiter = new Delimiter();
        List<String> result = delimiter.split("//-\n1-2:3");

        assertEquals(Arrays.asList("1", "2", "3"), result);
    }
}

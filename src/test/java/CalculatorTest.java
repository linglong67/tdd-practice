import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void sum_single_num() {
        Calculator cal = new Calculator();
        int result = cal.sum("1");

        assertEquals(1, result);
    }

    @Test
    void sum_multi_nums_with_default_delimiter() {
        Calculator cal = new Calculator();
        int result = cal.sum("1:2,3:4,");

        assertEquals(10, result);
    }

    @Test
    void sum_multi_nums_with_custom_delimiter() {
        Calculator cal = new Calculator();
        int result = cal.sum("//-\n1-3,5:7");

        assertEquals(16, result);
    }

    @Test
    void sum_multi_nums_with_non_num() {
        Calculator cal = new Calculator();

        assertThrows(IllegalArgumentException.class,
                () -> cal.sum("//;\n1=3,5:7"));
    }

    @Test
    void sum_multi_nums_with_negative_num() {
        Calculator cal = new Calculator();

        assertThrows(IllegalArgumentException.class,
                () -> cal.sum("//;\n1;3,5:-7"));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void zero_if_blank() {
        Calculator cal = new Calculator();
        int result = cal.sum("   ");

        assertEquals(0, result);
    }

    @Test
    void zero_if_null() {
        Calculator cal = new Calculator();
        int result = cal.sum(null);

        assertEquals(0, result);
    }

    @Test
    void return_single_number() {
        Calculator cal = new Calculator();
        int result = cal.sum("11");

        assertEquals(11, result);
    }

    @Test
    void throw_exception_if_negative() {
        Calculator cal = new Calculator();

        assertThrows(IllegalArgumentException.class, () -> cal.sum("-1"));
    }

    @Test
    void throw_exception_if_not_number() {
        Calculator cal = new Calculator();

        assertThrows(NumberFormatException.class, () -> cal.sum("ABC"));
    }
}

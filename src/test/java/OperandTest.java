import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperandTest {

    @Test
    void zero_if_blank() {
        Operand op = new Operand();
        int result = op.getValue("   ");

        assertEquals(0, result);
    }

    @Test
    void zero_if_null() {
        Operand op = new Operand();
        int result = op.getValue(null);

        assertEquals(0, result);
    }

    @Test
    void return_single_number() {
        Operand op = new Operand();
        int result = op.getValue("11");

        assertEquals(11, result);
    }

    @Test
    void throw_exception_if_negative() {
        Operand op = new Operand();

        assertThrows(IllegalArgumentException.class, () -> op.getValue("-1"));
    }

    @Test
    void throw_exception_if_not_number() {
        Operand op = new Operand();

        assertThrows(NumberFormatException.class, () -> op.getValue("ABC"));
    }
}

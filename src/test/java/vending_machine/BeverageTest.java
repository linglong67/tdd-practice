package vending_machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageTest {
    @Test
    void get_price() {
        Beverage beverage = new Beverage(Beverages.COKE);
        assertEquals(2000, beverage.getPrice());
    }
}

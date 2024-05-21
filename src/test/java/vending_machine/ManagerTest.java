package vending_machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    @Test
    void supply_beverage() {
        Beverage coke = new Beverage(Beverages.COKE);
        Manager manager = new Manager();

        manager.supplyBeverage(coke, 100);
        assertEquals(100, coke.getStock());
    }

    @Test
    void supply_money() {
        VendingMachine vendingMachine = new VendingMachine();
        Manager manager = new Manager();

        manager.supplyMoney(vendingMachine, 100_000);
        assertEquals(100_000, vendingMachine.getMoney());
    }

    //TODO::등록되지 않은 음료 종류 추가 (예외)
}

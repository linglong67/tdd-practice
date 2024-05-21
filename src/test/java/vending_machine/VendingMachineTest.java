package vending_machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
    @Test
    void show_beverages() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.registerBeverageType(new Beverage(Beverages.COKE));
        vendingMachine.registerBeverageType(new Beverage(Beverages.CIDER));
        vendingMachine.registerBeverageType(new Beverage(Beverages.LEMONADE));
        vendingMachine.registerBeverageType(new Beverage(Beverages.WATER));

        assertEquals(4, vendingMachine.getBeverages().size());
    }

    @Test
    void minus_stock_after_serve_beverage() {
        VendingMachine vendingMachine = new VendingMachine();
        Beverage coke = new Beverage(Beverages.COKE);
        Manager manager = new Manager();

        vendingMachine.registerBeverageType(coke);
        manager.supplyBeverage(coke, 100);

        vendingMachine.serveBeverage(coke);
        assertEquals(99, coke.getStock());
    }

    //TODO::음료 제공 후 잔돈 차감
    @Test
    void minus_money_after_serve_beverage() {
        VendingMachine vendingMachine = new VendingMachine();
        Beverage coke = new Beverage(Beverages.COKE);
        Manager manager = new Manager();

        vendingMachine.registerBeverageType(coke);
        manager.supplyMoney(vendingMachine, 10_000);

        vendingMachine.serveBeverage(coke);
        assertEquals(8000, vendingMachine.getMoney());
    }

    //TODO::잔돈 부족 시 환불 (예외)
    //TODO::음료 없을 시 환불 (예외)
}

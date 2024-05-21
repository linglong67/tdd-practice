package vending_machine;

public class Manager {

    public void supplyBeverage(Beverage beverage, int stock) {
        beverage.addStock(stock);
    }

    public void supplyMoney(VendingMachine vendingMachine, int money) {
        vendingMachine.addMoney(money);
    }
}

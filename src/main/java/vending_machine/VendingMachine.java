package vending_machine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int money;
    private List<Beverage> beverages = new ArrayList<>();

    public int getMoney() {
        return money;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void registerBeverageType(Beverage beverage) {
        beverages.add(beverage);
    }

    public void serveBeverage(Beverage beverage) {
        this.money -= beverage.getPrice();
        beverage.subtractStock();
    }
}

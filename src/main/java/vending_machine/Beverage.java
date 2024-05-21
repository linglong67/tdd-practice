package vending_machine;

public class Beverage {
    private String name;
    private int price;
    private int stock;

    public Beverage(Beverages beverage) {
        this.name = beverage.name();
        this.price = beverage.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int stock) {
        this.stock += stock;
    }

    public void subtractStock() {
        this.stock -= 1;
    }
}

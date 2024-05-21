package vending_machine;

public enum Beverages {
    COKE(2000),
    CIDER(2000),
    LEMONADE(2500),
    WATER(1000);

    int price;

    Beverages(int price) {
        this.price = price;
    }
}

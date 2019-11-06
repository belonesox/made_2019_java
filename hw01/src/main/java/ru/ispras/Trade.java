package ru.ispras;

public abstract class Trade {
    private Number price;

    public Trade(Number price) {
        this.price = price;
    }

    public Number getPrice() {
        return price;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": $" + price.toString();
    }
}

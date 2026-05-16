package rvt.shop;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.quantity * this.unitPrice;
    }

    public void increaseQuantity() {
        this.quantity += 1;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
    }
}
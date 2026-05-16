package rvt.shop;
import java.util.*;
import java.util.HashMap;

public class Item {
    public static void main(String[] args) {
        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
    }

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quality = qty;
        this.unitPrice = price;
    }

    public int price() {
        return price;
    }

    public void increaseQuality() {
        this.qty += 1;
    }

    public String toString; {
        return this.product + ": " + this.qty;
    }
}
package rvt.shop;
import java.util.*;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        }

        int amount = this.stocks.get(product);
        if (amount > 0) {
            this.stocks.put(product, amount - 1);
            return true;
        }
        return false;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }

    public Set<String> products() {
        return this.stocks.keySet();
    }

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
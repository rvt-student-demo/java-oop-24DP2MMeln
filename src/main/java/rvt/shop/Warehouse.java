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
        return - 99;
    }

    public boolean take (String product) {
        return false; //placeholder

    }

    public int stock (String product) {
        return 0; //placeholder

    }

    public set<String> products() {

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
package rvt;

import java.util.HashMap;

public class IOweYou {

  
    
    private HashMap<String, Double> hashmap;
    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU iou = new IOU();
        iou.setSum("Arthur", 51.5);
        iou.setSum("Michael", 30);

        System.out.println(iou.howMuchDoIOweTo("Arthur"));
        System.out.println(iou.howMuchDoIOweTo("Michael"));
    }
}
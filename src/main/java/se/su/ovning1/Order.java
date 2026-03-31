package se.su.ovning1;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private final long orderNumber;
    private static long counter;
    private final List<Item> items;
    public Order(ArrayList<Item> items) {
        this.items = items;
    }
    public String getReceipt() {
        return "";
    }
    public double getTotalValue(){
        return 0.0;

    }
}

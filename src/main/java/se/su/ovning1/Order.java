package se.su.ovning1;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private final long orderNumber;
    private static long counter;
    private final List<Item> items = new ArrayList<>();
    public  Item[] item;
    public Order((Item ... item) {
        this.item = items;
    }
    public String getReceipt() {
        return "";
    }
    public double getTotalValue(){
        return 0.0;

    }
}

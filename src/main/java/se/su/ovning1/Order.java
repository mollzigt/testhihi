package se.su.ovning1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Order{
    private static long counter;
    private final long orderNumber;

    private final List<Item>items=new ArrayList<>();


    public Order(Item ... item) {
        Collections.addAll(items, item);
        counter++;
        orderNumber = counter;
    }
    public String getReceipt() {
        StringBuilder receipt = new StringBuilder("Receipt for order #" + orderNumber + "\n");

        for(Item item:items){
            receipt.append(item.toString()).append(": ");
        }

        receipt.append("\n"+"Total excl. VAT: "+getTotalValue());
        receipt.append("\n"+"Total incl. VAT: "+getTotalValuePlusVAT());
        return receipt.toString();

    }
    public double getTotalValue(){
        double price=0.0;
        for(Item item:items){
            price+=item.getPrice();
        }
        return price;

    }
    public double getTotalValuePlusVAT(){
        double price=0.0;
        for(Item item:items){
            price+=item.getPriceWithVAT();
        }
        return price;
    }
}

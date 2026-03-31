package se.su.ovning1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Order{
    private final long orderNumber;
    private static long counter;
    private final List<Item>items=new ArrayList<>();


    public Order(Item ... item) {
        Collections.addAll(items, item);
        counter++;
        orderNumber = counter;
    }
    public String getReceipt() {
        StringBuilder receipt = new StringBuilder("Receipt for order #" + orderNumber + "\n");

        for(Item item:items){
            if (item instanceof Book){
                receipt.append(((Book) item).toString()).append(": ");
                receipt.append("name=").append(item.getName()).append(", ");
               // receipt.append("author=").append(((Book) item).getAuthor()).append(", ");
               // receipt.append("bound=").append(((Book) item).getBound()).append(" ");
                receipt.append("price=").append(((Book) item).getPrice()).append(" ");
                receipt.append("price+VAT=").append(((Book) item).getPriceWithVAT()).append(" ");
            }else{
                receipt.append(((Recording) item).getType()).append(": ");
                receipt.append("name=").append(item.getName()).append(", ");
                receipt.append("year=").append(((Recording) item).getYear()).append(", ");
                receipt.append("price=").append(item.getPrice()).append(" ");
            }


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

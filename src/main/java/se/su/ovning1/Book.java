package se.su.ovning1;


public class Book extends Item implements PriceableWithVAT6{
    private final double price;
    private final boolean bound;
    private final String author;


    protected Book(String name, String author, double price, boolean bound) {
        super(name);
        this.price = price;
        this.bound = bound;
        this.author = author;
    }
    public double getPrice(){
        if (bound) {
            return price * 1.3;
        } else {
            return price;
        }
    }

    //döpte om till toString. Denna gör fel utskrift
    public String toString(){
        String str="Book: ";
        str+= "bound="+this.bound;
        str+= "name="+this.getName();
        str+= "author="+this.author;
        str+= "price="+this.getPrice();
        str+= "price+VAT="+this.getPriceWithVAT();

        return str;
    }
}

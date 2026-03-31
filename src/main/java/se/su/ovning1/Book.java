package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{
    final private double price;
    final private boolean bound;
    final private String author;

    //Enligt testen ska denna klass endast ha två publika metoder utöver konstruktor

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

    public boolean getBound(){
        return bound;
    }

    public String getAuthor(){
        return author;
    }

    //döpte om till toString. Denna gör fel utskrift
    public String toString(){
        String receipt="Book";
        receipt+= ("bound="+(this.getBound())+(" "));
        receipt+= ("name="+(this.getName())+(", "));
        receipt+= ("author="+(this.getAuthor())+(", "));
        receipt+= ("price="+(this.getPrice())+(", "));
        receipt+= ("price+VAT="+(this.getPriceWithVAT())+(", "));

        return receipt;
    }
}

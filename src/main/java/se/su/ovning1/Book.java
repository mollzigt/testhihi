package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{
    final private double price;
    final private boolean bound;
    final private String author;

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
    @Override
    public String toString(){
        return "";
    }
}

package se.su.ovning1;

public interface Priceable {

    public abstract double getPrice();

    public abstract double getVAT();

   default double getPriceWithVAT() {
        double priceWithVat = this.getPrice() *  (1 + this.getVAT());
        return priceWithVat;
    }
}

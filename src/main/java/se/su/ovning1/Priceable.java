package se.su.ovning1;

public interface Priceable {

     double getPrice();

     double getVAT();

   default double getPriceWithVAT() {
        double priceWithVat = this.getPrice() *  (1 + this.getVAT());
        return priceWithVat;
    }
}

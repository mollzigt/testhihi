package se.su.ovning1;

public interface PriceableWithVAT6 extends Priceable{

    @Override
    public double getPrice(){
        return this.getPrice();
    }

    default double getVAT(){
        return 0.06;
    }

}

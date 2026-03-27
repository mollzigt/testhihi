package se.su.ovning1;

public interface PriceableWithVAT25 extends Priceable {

    public double getVat(){
        return 0.25;
    }

}

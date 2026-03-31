package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    //Denna konstruktor behöver kärlek
    protected Recording(String name) {
        super(name);
    }
}

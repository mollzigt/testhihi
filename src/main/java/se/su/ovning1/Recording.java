package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    //Denna konstruktor behöver kärlek
    private String name;
    private String artist;
    private int year;
    private int condition;
    protected Recording(String name, String artist, int year, int condition,
                        double price) {
        super(name);
    }
}

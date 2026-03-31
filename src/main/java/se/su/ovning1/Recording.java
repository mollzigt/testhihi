package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    //Denna konstruktor behöver kärlek
    private String name;
    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist=artist;
        this.year=year;
        this.condition=condition;
        this.price=price;
    }

    public String getArtist(){
        return artist;
    }

    //Abstrakt metod mall för subklasser
    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    public double getPrice(){
        return price;
    }

    //Osäker på om denna metod, kolla över returen
    public String toString(){
        return "recording";
    }

    public int getYear(){
        return year;
    }

    //Vad är original price?? Kolla över detta
    protected double getOriginalPrice(){
        return price;
    }
}

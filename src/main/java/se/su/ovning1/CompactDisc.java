package se.su.ovning1;

public class CompactDisc extends Recording{
    //Denna konstruktor behöver kärlek
    private String name;
    private String artist;
    private int year;
    private int condition;
    protected CompactDisc(String name, String artist, int year, int condition,
                          double price) {
        super(name, artist, year, condition, price);

    }


}

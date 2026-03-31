package se.su.ovning1;

public class CompactDisc extends Recording{
    //Denna konstruktor behöver kärlek

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }

    public String getType(){
        return "CD";
    }

}

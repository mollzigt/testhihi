package se.su.ovning1;


public class CompactDisc extends Recording{

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }
    @Override
    public String getType(){
        String s="CD: ";

        s+= "name="+super.getName();
        s+= "artist="+super.getArtist();
        s+= "year="+super.getYear();
        s+= "condition="+super.getCondition();
        s+= "original price="+super.getOriginalPrice();
        s+= "price="+super.getPrice();
        s+= "price+VAT="+super.getPriceWithVAT();



        return s;
    }

}

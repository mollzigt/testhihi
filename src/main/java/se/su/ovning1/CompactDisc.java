package se.su.ovning1;

public class CompactDisc extends Recording{

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }
@Override
    public String getType(){
        String CD="CD";

        CD+= ("name="+(super.getName())+(","));
        CD+= ("artist="+(super.getArtist())+(","));
        CD+= ("year="+(super.getYear())+(","));
        CD+= ("condition="+(super.getCondition())+(","));
        CD+= ("original price="+(super.getOriginalPrice())+(","));
        CD+= ("price="+(super.getPrice())+(","));
        CD+= ("price+VAT="+(super.getPriceWithVAT())+(","));



        return CD;
    }

}

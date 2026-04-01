package se.su.ovning1;



public class LongPlay extends Recording{

    public LongPlay (String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }
    @Override
    public String getType(){
        String s="LP: ";

        s+= "name= '"+super.getName();
        s+= " artist="+super.getArtist();
        s+= " year="+super.getYear();
        s+= " condition="+super.getCondition();
        s+= " original price="+super.getOriginalPrice();
        s+= " price="+super.getPrice();
        s+= " price+VAT="+super.getPriceWithVAT();


        return s;
    }

    @Override
    public double getPrice(){
        double price = super.getPrice()*((double) super.getCondition()/10 ) + (2025 - super.getYear()) * 5.0;

        if (price < 10 && super.getCondition()!=1 ){
            return 10;
        }
        if(this.getYear()==2026){
            return super.getPrice();
        }
        else {
            return price;
        }
    }

}

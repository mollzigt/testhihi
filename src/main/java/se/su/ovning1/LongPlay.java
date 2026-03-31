package se.su.ovning1;

public class LongPlay extends Recording{

    public LongPlay (String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }
    @Override
    public String getType(){
        String LP="LP";


        LP+= ("name="+(super.getName())+(","));
        LP+= ("artist="+(super.getArtist())+(","));
        LP+= ("year="+(super.getYear())+(","));
        LP+= ("condition="+(super.getCondition())+(","));
        LP+= ("original price="+(super.getOriginalPrice())+(","));
        LP+= ("price="+(super.getPrice())+(","));
        LP+= ("price+VAT="+(super.getPriceWithVAT())+(","));


        return LP;
    }

    @Override
    public double getPrice(){
        double price = super.getPrice()*((double) super.getCondition()/10 ) + (2025 - this.getYear()) * 5.0;

        if (price < 10 && super.getCondition()!=1 ){
            return 10;
        }
        //i VPL så MÅSTE 2026 tas upp här
        if(this.getYear()==2025){
            return super.getPrice();
        }
        else {
            return price;
        }
    }

}

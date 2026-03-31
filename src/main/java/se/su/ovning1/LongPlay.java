package se.su.ovning1;

public class LongPlay extends Recording{

    public LongPlay (String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);

    }

    public String getType(){
        return "LP";
    }

    @Override
    public double getPrice(){
        double price = super.getPrice()*((double) super.getCondition() /10) + (2025 - this.getYear()) * 5.0;

        if (price < 10){
             return 10;
         } else {
             return price;
         }
    }

}

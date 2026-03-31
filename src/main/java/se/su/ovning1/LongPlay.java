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
        double age = 2025-this.getYear();
        double priceIncrease = age*5;
        double conditionFactor= (double) this.getCondition()/10;
        double conditionPrice = conditionFactor * this.getOriginalPrice() ;

        if(age == 0 && conditionFactor == 0){
            return getOriginalPrice();

        }else{
            return conditionPrice + priceIncrease;

        }
    }

}

package se.su.ovning1;



public abstract class Recording extends Item implements PriceableWithVAT25 {

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


    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    public double getPrice(){
        int age = 2025 - year;
        double newPrice = price * (condition/10.0);


        if (newPrice <= 10){
            return 10;
        }
        else {
            return newPrice;
        }

    }
    @Override
    public String toString(){
        String string="";
        string+=this.getType();
        string+= "name="+this.getName();
        string+= "artist="+this.getArtist();
        string+= "year="+this.getYear();
        string+= "condition="+this.getCondition();
        string+= "original price="+this.getOriginalPrice();
        string+= "price="+this.getPrice();
        string+= "price+VAT="+this.getPriceWithVAT();


        return string;
    }

    public int getYear(){
        return year;
    }


    protected double getOriginalPrice(){
        return price;
    }
}

package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    //Denna konstruktor behöver kärlek
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

    //HÄR KRÄVS EN TYPKONVERTERING FÖR ATT GÖRA METODEN FLEXIBEL  FÖR UTSKRIFTER DÄR TYPEN ÄNDRAS
    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    public double getPrice(){
        int age = 2025 - year;
        double newPrice = price * (condition/10.0);


        if (newPrice <= 10 ){
            return 10;
        }
        else {
            return newPrice;
        }

    }

    //Osäker på om denna metod, kolla över returen
    public String toString(){
        String LP="LP";

        LP+= ("name="+(this.getName())+(","));
        LP+= ("artist="+(this.getArtist())+(","));
        LP+= ("year="+(this.getYear())+(","));
        LP+= ("condition="+(this.getCondition())+(","));
        LP+= ("original price="+(this.getOriginalPrice())+(","));
        LP+= ("price="+(this.getPrice())+(","));
        LP+= ("price+VAT="+(super.getPriceWithVAT())+(","));


        return LP;
    }

    public int getYear(){
        return year;
    }

    //Vad är original price?? Kolla över detta
    protected double getOriginalPrice(){
        return price;
    }
}

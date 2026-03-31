package se.su.ovning1;

import java.awt.print.Printable;

public abstract class Item implements Priceable {
    private final String name;
    protected Item(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }
}

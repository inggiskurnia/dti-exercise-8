package entity;

import feature.Details;

public abstract class Event implements Details {
    protected String name;
    protected double price;
    protected int quota;

    public Event (String name, double price, int quota){
        this.name = name;
        this.price = price;
        this.quota = quota;
    }

    public abstract int getQuota();
    public abstract void setQuota(int quota);
    public abstract String getName();
    public abstract double getPrice();

}

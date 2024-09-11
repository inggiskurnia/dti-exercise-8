package App;

public abstract class Event {
    protected String name;
    protected String place;
    protected double price;
    protected int quota;

    public Event (String name, String place, double price, int quota){
        this.name = name;
        this.place = place;
        this.price = price;
        this.quota = quota;
    }

    public abstract int getQuota();
    public abstract void setQuota(int quota);
    public abstract String getName();
    public abstract double getPrice();
    public abstract void printDetails();

}

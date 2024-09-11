package events;

import entity.Event;

public class OfflineEvent extends Event {
    private String place;

    public OfflineEvent(String name, double price, int quota, String place){
        super(name, price, quota);
        this.place = place;
    }

    @Override
    public int getQuota() {
        return quota;
    }

    @Override
    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getPlace(){
        return place;
    }

    @Override
    public void getDetails() {
        System.out.println(name);
        System.out.println("Price " + price);
        System.out.println("Availabel quota " + quota);
        System.out.println("entity.Event took place in " + place);
    }
}

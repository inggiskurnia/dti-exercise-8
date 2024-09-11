package events;

import entity.Event;

public class OnlineEvent extends Event {

    public OnlineEvent(String name, double price, int quota){
        super(name, price, quota);
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

    @Override
    public void getDetails() {

    }
}

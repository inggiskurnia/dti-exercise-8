package App;

public class Sports extends Event{

    public Sports(String name, String place, double price, int quota){
        super(name, place, price, quota);
    }

    @Override
    public int getQuota() {
        System.out.println("Remaining quota for the event is " + quota);
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
    public void printDetails() {
        System.out.println(name);
        System.out.println("Event took place in " + place);
        System.out.println("Price " + price);
    }
}

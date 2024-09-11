package App;

public class User {
    String name;
    double balance;

    public User (String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){
        System.out.println("Remaining balance is " + balance);
        return balance;
    }

    public void addBalance(double balance){
        this.balance -= balance;
        System.out.println("Balance updated : " + balance);
    }
}

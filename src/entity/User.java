package entity;

import feature.Details;

import java.util.UUID;

public class User {
    String name;
    double balance;
    UUID id;

    public User (String name, double balance){
        this.name = name;
        this.balance = balance;
        this.id = UUID.randomUUID();
    }

    public String getName(){
        return name;
    }
}

package optional.monads;

import lombok.Setter;

@Setter
public class Customer {
    private int id;
    private String name;


    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Customer(){ // deverar ser retirado

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + '}';
    }
}

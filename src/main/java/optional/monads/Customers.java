package optional.monads;

import java.util.HashMap;
import java.util.Optional;

public class Customers {
    private HashMap<Integer, Customer> customers;

    public Customers() {
        customers = new HashMap<>();
    }

    public void addCustomer(int id, Customer customer) {
        customers.put (id, customer);
    }

    public Customer findCustomerWithId(int id) {
        if(customers.containsKey (id)){
            return customers.get (id);
    }
        else {
        return null;
        }
    }

    public Optional<Customer> findOptionalCustomerWithId(int id) {
        if (customers.containsKey (id)) {
            return Optional.of (customers.get (id));
        } else {
            return Optional.empty ();
        }
    }
    //An alternate shorter implementation of the findOptionalCustomerWithID method
    //follows using the ofNullable method
    public Optional<Customer> findOptionalCustomerWithId2(int id) {
        return Optional.ofNullable (customers.get (id));
    }

    public static void main(String[] args) {

        Customer customer1 = new Customer(123, "Sue");
        Customer customer2 = new Customer(456, "Bob");
        Customer customer3 = new Customer(789, "Mary");
        Customer defaultCustomer = new Customer(0, "Default");
        Customers customers = new Customers();
        customers.addCustomer(defaultCustomer.getId(),
                defaultCustomer);
        customers.addCustomer(customer1.getId(), customer1);
        customers.addCustomer(customer2.getId(), customer2);
        customers.addCustomer(customer3.getId(), customer3);

        if (customer.getName().equals("Mary")) { // fazer a correção
            System.out.println("Processing Mary");
        }
    }
}

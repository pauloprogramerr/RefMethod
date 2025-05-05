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

        return Optional
                .ofNullable (customers.get (id));
    }


    public static void avoidsIfElse (Customers customerss, int id, Customer defaultCustomer) {
        /*  The Optional class's
            orElse method can be used for the same purpose and avoids the if statement.
            The following statement is used to return the defaultCustomer instance when
            findOptionalCustomerWithID doesn't return a customer
         */
        Customer current = customerss
                .findOptionalCustomerWithId(id)
                .orElse (defaultCustomer);

        current = customerss
                .findOptionalCustomerWithId(id)
                .orElseGet (() ->
                        customerss.findOptionalCustomerWithId (0).get ());
    }
}

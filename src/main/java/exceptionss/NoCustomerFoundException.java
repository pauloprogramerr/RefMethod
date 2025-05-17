package exceptionss;

import optional.monads.Customer;
import optional.monads.Customers;

public class NoCustomerFoundException extends Exception {

    public static void foungException(Customers customers,  int id) {
        try {
            Customer current = customers
                    .findOptionalCustomerWithId(id)
                    .orElseThrow (NoCustomerFoundException::new);
            System.out.println (current);

        } catch (NoCustomerFoundException ex) {
            // handle the exception
        }
    }
}
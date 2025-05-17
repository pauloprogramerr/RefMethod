package optional;


import optional.monads.Customer;
import optional.monads.Customers;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class   ValuesGreaterThanTen {

    public static void greaterThanTen() {
        OptionalInt result = IntStream.of(1, 5, 12, 7, 5, 24, 6)
                .filter (n -> n > 10)
                .max ();
        result.ifPresent (o -> System.out.println (o));

    }

    public static void greaterThanFourHundred(Customers customers) {
            int id = 456;
            String name;

        Optional<Customer> optCustomer =
                customers.findOptionalCustomerWithId (id);
        if (optCustomer.isPresent ())
            name = optCustomer.get ().getName ().trim ();
        else
            name = "no name";
        System.out.println (name);

        // No instrutcion if else

        name = customers
                .findOptionalCustomerWithId (id)
                        .map (o -> o.getName ().trim ())
                                .orElse ("no name");
        System.out.println (name);



            Customer current = customers
                    .findOptionalCustomerWithId (id)
                    .filter (i -> i.getId () > 400)
                    .orElseGet (() -> customers.findOptionalCustomerWithId (0).get ());

            System.out.println (current);

    }

    public static void main(String[] args) {
        greaterThanTen ();
    }
}

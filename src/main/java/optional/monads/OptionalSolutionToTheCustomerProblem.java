package optional.monads;

import exceptionss.NoCustomerFoundException;

import java.util.Optional;
import java.util.function.Function;



public class OptionalSolutionToTheCustomerProblem {
    public static void theCustonerProblem (Customers customers, Customer current,int id) {



        id = 789;
        Optional<Customer> optionalCustomer =
                customers.findOptionalCustomerWithId (id);

        Function<? super Customer, Customer> processMary = x -> {
          if (x.getName ().equals ("Mary")) {
              System.out.println ("Processing Mary");
          }
          return x;
        };

        Function<?super Customer, Customer> processNotMary = x -> {
            if (!x.getName ().equals ("Mary")) {
                System.out.println (x);
            }
            return x;
        };

        Function<? super Customer, Customer> processCustomer =  x -> {
            if (x.getName ().equals ("Mary")) {
                System.out.println ("Processing Mary");
            } else {
                System.out.println (optionalCustomer.get());
            }
            return x;
        };

        try {
            //We can replace the two map methods with the following one to achieve the /same results:
            //    .map(processCustomer)

            Main.customer3.setName ("Mary Sue");
            current = customers
                    .findOptionalCustomerWithId2 (id)
                    .map (processMary)
                    .map (processCustomer)
                    .orElseThrow (NoCustomerFoundException::new);
            System.out.println (current);
        } catch (NoCustomerFoundException ex) {
            ex.printStackTrace ();
        }
    }
}

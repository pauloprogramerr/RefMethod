package mains;

import optional.monads.Customer;
import optional.monads.Customers;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        int id = 234;


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

        Customers.avoidsIfElse(customers, id, defaultCustomer);

        Customer customer = new Customer(); // foi adicionado para amenizar o erro
        if (customer.getName().equals("Mary")) { // fazer a correção
            System.out.println("Processing Mary");
        }

        Customer customer4 = customers.findCustomerWithId(id);
        if (customer4.getName().equals("Mary")) { // fazer a correção
            System.out.println ("Processing Mary");
        }
        if (customer4 != null) {
            if (customer4.getName ().equals ("Mary")) { // fazer a correção
                System.out.println ("Processing Mary");
            }else {
                System.out.println (customer4);
            }
        } else
            System.out.println (defaultCustomer);
    }
}

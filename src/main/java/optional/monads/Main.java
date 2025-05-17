package optional.monads;

import optional.ValuesGreaterThanTen;

public class Main {

    public static Customer customer1 = new Customer(123, "Sue");
    public static Customer customer2 = new Customer(456, "Bob");
    public static Customer customer3 = new Customer(789, "Mary");
    public static Customer defaultCustomer = new Customer(0, "Default");

    public static void main(String[] args) {

        int id = 234;



        Customers customers = new Customers();
        customers.addCustomer(defaultCustomer.getId(),
                defaultCustomer);
        customers.addCustomer(customer1.getId(), customer1);
        customers.addCustomer(customer2.getId(), customer2);
        customers.addCustomer(customer3.getId(), customer3);


        Customers.avoidsIfElse(customers, id, defaultCustomer);
/*
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
*/

        ValuesGreaterThanTen.greaterThanFourHundred (customers);
    }
}

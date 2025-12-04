package ArrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer (1, "Yağmur", "Sezay"));
        customers.add(new Customer (2, "Baran", "Gürkan"));
        customers.add(new Customer (3, "Muri", "Gürkan"));

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}

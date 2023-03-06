package baithijava2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Customer> customers = new HashMap<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new customer");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addCustomer(input);
                    break;
                case 2:
                    searchName(input);
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCustomer(Scanner input) {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter phone number: ");
        String phone = input.nextLine();
        Customer customer = new Customer(name, email, phone);
        customers.put(name, customer);
        System.out.println("Customer added successfully.");
    }

    private static void searchName(Scanner input) {
        System.out.print("Enter name to search: ");
        String name = input.nextLine();
        Customer customer = customers.get(name);
        if (customer == null) {
            System.out.println("Not found.");
        } else {
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
        }


    }

    private static void displayAll() {

        if (customers.isEmpty()) {
            System.out.println("No customers in the database.");
        } else {
            System.out.println("Customers in the database:");
            for (String name : customers.keySet()) {
                Customer customer = customers.get(name);
                System.out.println("Name: " + customer.getName());

                System.out.println("Email: " + customer.getEmail());
                System.out.println("Phone: " + customer.getPhone());
                System.out.println("------------------------");
            }
        }
    }
}

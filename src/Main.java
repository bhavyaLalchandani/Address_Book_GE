import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do {
            System.out.println(
                    "Enter 1 to create a new contact" +
                    "\nEnter 2 to display existing contacts" +
                    "\nEnter 3 to edit an existing contact" +
                    "\nEnter 4 to delete an existing contact" +
                    "\nEnter 5 to add multiple contacts" +
                    "\nEnter 0 to exit"
            );
            int input = sc.nextInt();

            switch (input) {
                case 1 -> a1.createContact();
                case 2 -> a1.display();
                case 3 -> {
                    System.out.println("Enter first and last name of contact to edit");
                    String firstName = sc.next();
                    String lastName = sc.next();
                    a1.editContact(firstName, lastName);
                }
                case 4 -> {
                    System.out.println("Enter first and last name of contact to delete");
                    String firstName = sc.next();
                    String lastName = sc.next();
                    a1.deleteContact(firstName, lastName);
                }
                case 5 -> a1.createMultipleContacts();
                case 0 -> System.exit(0);
                default -> System.out.println("Wrong Input");
            }

            System.out.println("Enter 0 to exit");
        } while (true);
    }
}
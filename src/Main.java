import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Refactoring the Main file
        AddressBookSystem system = new AddressBookSystem();
        Scanner sc = new Scanner(System.in);
        AddressBook currentAddressBook = null;

        System.out.println("Welcome to the Address Book System");

        while (true) {
            System.out.println(
                    "Enter 1 to create a new Address Book" +
                    "\nEnter 2 to select an Address Book" +
                    "\nEnter 3 to add a contact to the selected Address Book" +
                    "\nEnter 4 to display contacts in the selected Address Book" +
                    "\nEnter 5 to add multiple contacts" +
                    "\nEnter 0 to exit"
            );
            int input = sc.nextInt();

            switch (input) {
                case 1 -> {
                    System.out.println("Enter the name of the new Address Book:");
                    String name = sc.next();
                    system.addAddressBook(name);
                }
                case 2 -> {
                    system.displayAddressBooks();
                    System.out.println("Enter the name of the Address Book to select:");
                    String name = sc.next();
                    currentAddressBook = system.getAddressBook(name);
                    if (currentAddressBook == null) {
                        System.out.println("No Address Book found with the name '" + name + "'.");
                    } else {
                        System.out.println("Address Book '" + name + "' selected.");
                    }
                }
                case 3 -> {
                    if (currentAddressBook != null) {
                        currentAddressBook.createContact();
                    } else {
                        System.out.println("No Address Book is currently selected. Please select or create one first.");
                    }
                }
                case 4 -> {
                    if (currentAddressBook != null) {
                        currentAddressBook.display();
                    } else {
                        System.out.println("No Address Book is currently selected. Please select or create one first.");
                    }
                }
                case 5 -> {
                    if (currentAddressBook != null) {
                        currentAddressBook.createMultipleContacts();
                    } else {
                        System.out.println("No Address Book is currently selected. Please select or create one first.");
                    }
                }
                case 0 -> {
                    System.out.println("Exiting the Address Book System. Bye Bye, Visit Again!");
                    System.exit(0);
                    sc.close();
                    return;
                }
                default -> System.out.println("Wrong Input");
            }
        }
    }
}
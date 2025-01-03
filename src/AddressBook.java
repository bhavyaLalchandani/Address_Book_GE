import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();
    public void display(){
        System.out.println(adBook);
    }

    // USE CASE 1
    public void createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name");
        String name = sc.next();
        System.out.println("Enter Last name");
        String lname = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Email ID");
        String email = sc.next();
        System.out.println("Enter Phone no.");
        long phone = sc.nextLong();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        adBook.add(c1);
        System.out.println("Contact is added");
    }

    // USE CASE 3: Edit existing contact
    public void editContact(String firstName, String lastName) {
        for (Contact contact : adBook) {
            if (contact.firstName.equalsIgnoreCase(firstName) && contact.lastName.equalsIgnoreCase(lastName)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter updated City");
                contact.city = sc.next();
                System.out.println("Enter updated State");
                contact.state = sc.next();
                System.out.println("Enter updated Email");
                contact.email = sc.next();
                System.out.println("Enter updated Phone");
                contact.phone = sc.nextLong();
                System.out.println("Enter updated Zip");
                contact.zip = sc.nextInt();
                System.out.println("Contact updated successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    // USE CASE: 4 Delete Contact
    public void deleteContact(String firstName, String lastName) {
        Contact toDelete = null;
        for (Contact contact : adBook) {
            if (contact.firstName.equalsIgnoreCase(firstName) && contact.lastName.equalsIgnoreCase(lastName)) {
                toDelete = contact;
                break;
            }
        }
        if (toDelete != null) {
            adBook.remove(toDelete);
            System.out.println("Contacts named " + firstName + " " + lastName + " deleted successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    // USE CASE 5: Add multiple contacts
    public void createMultipleContacts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contacts to add:");
        int numContacts = sc.nextInt();
        for (int i = 0; i < numContacts; i++) {
            System.out.println("Adding contact " + (i + 1) + ":");
            createContact();
        }
        System.out.println(numContacts + " contacts have been added.");
    }
}

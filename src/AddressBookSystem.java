import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    // Add a new Address Book and Maintain a Dictionary (Hashmap in Java)
    public void addAddressBook(String name) {
        if (addressBooks.containsKey(name)) {
            System.out.println("An Address Book with this name already exists.");
        } else {
            addressBooks.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' has been added.");
        }
    }

    // Get an Address Book by name
    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    // Display all Address Book names
    public void displayAddressBooks() {
        System.out.println("Available Address Books: " + addressBooks.keySet());
    }
}


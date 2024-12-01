import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook a1 = new AddressBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do {
            System.out.println("Enter 1 to create a new contact \nEnter 2 to display existing contacts");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> a1.createContact();
                case 2 -> a1.display();
                default -> System.out.println("Wrong input");
            }

            System.out.println("Enter 0 to exit");
        } while (i != 0);

        System.out.println("Thank you for using address book");
        sc.close();
    }
}
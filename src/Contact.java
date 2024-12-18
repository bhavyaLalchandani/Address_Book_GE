import java.util.Scanner;

public class Contact {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    long phone;
    int zip;

    public Contact(String firstName, String lastName, String city, String state, String email, long phone, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact {" +
                "Name='" + firstName + '\'' +
                ", SurName='" + lastName + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Email='" + email + '\'' +
                ", Phone=" + phone +
                ", Zip=" + zip +
                '}';
    }
}
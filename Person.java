public class Person {

    private String name;
    private String contactNumber;

    // Constructor
    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for contactNumber
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter for contactNumber
    public String getContactNumber() {
        return contactNumber;
    }

    // Display method
    public void display() {
        System.out.println("Name of person is: " + name);
        System.out.println("Contact Number is: " + contactNumber);
    }
}

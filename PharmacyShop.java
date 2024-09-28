import java.util.Scanner;

public class PharmacyShop {

    private int count;
    private Person person; 
    private Address address; 
    private Medicine[] list = new Medicine[20];

    
    {
        list[0] = new Medicine("Paracetamol", "B001", 50, 23, "Pharmacol", "B122", new Date(1, 2, 2002));
        list[1] = new Medicine("Ibuprofen", "B002", 50, 23, "Pharmacol", "B122", new Date(1, 3, 2003));
        list[2] = new Medicine("Metformin", "M006", 50, 23, "Pharmacol", "B122", new Date(3, 5, 2009));
        list[3] = new Medicine("Aspirin", "M005", 50, 23, "Pharmacol", "B122", new Date(1, 3, 2002));
        list[4] = new Medicine("Omeprazole", "H007", 50, 23, "Pharmacol", "B122", new Date(3, 5, 2004));
        list[5] = new Medicine("Astrovestin", "M003", 50, 23, "Pharmacol", "B122", new Date(3, 1, 2001));
    }

    
    public PharmacyShop(Person person, Address address) {
        this.person = person;
        this.address = address;
    }

  public Medicine searchMedicine(String searchTerm, String type) {
    for (Medicine med : list) {
        if (med != null) {
            if (type.equals("name") && med.getName().equals(searchTerm)) {
                return med;
            } else if (type.equals("id") && med.getId().equals(searchTerm)) {
                return med;
            }
        }
    }
    return null;
}

    
    public void menu() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\nPharmacy Shop Menu:");
        System.out.println("1. Search Medicine by Name");
        System.out.println("2. Search Medicine by ID");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter the medicine name: ");
                String name = scanner.nextLine();
                Medicine medicineByName = searchMedicine(name, "name");
                if (medicineByName != null) {
                    System.out.println("Medicine found: " + medicineByName);
                } else {
                    System.out.println("Medicine not found!");
                }
                break;

            case 2:
                System.out.print("Enter the medicine ID: ");
                String id = scanner.nextLine();
                Medicine medicineById = searchMedicine(id, "id");
                if (medicineById != null) {
                    System.out.println("Medicine found: " + medicineById);
                } else {
                    System.out.println("Medicine not found!");
                }
                break;

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    } while (choice != 3);

    scanner.close();
}

    
   }
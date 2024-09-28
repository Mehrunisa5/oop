 public class Demo{

public static void main(String[] args) {
        
        Person owner = new Person("John Doe", "123-456-789");
        Address pharmacyAddress = new Address("B34", "lahore", "p03");

        PharmacyShop shop = new PharmacyShop(owner, pharmacyAddress);
        shop.menu(); 
    }
}

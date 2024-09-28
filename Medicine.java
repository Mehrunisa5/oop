public class Medicine {
    private String name;
    private String id;
    private int quantity;
    private double price;
    private String manufacturer;
    private String batchNo;
    private Date expiryDate;

    public Medicine(String name, String id, int quantity, double price, String manufacturer, String batchNo, Date expiryDate) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
        this.batchNo = batchNo;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Medicine{name='" + name + "', id='" + id + "', quantity=" + quantity + ", price=" + price + ", manufacturer='" + manufacturer + "', batchNo='" + batchNo + "', expiryDate=" + expiryDate + "}";
    }
}

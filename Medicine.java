public class Medicine{

private String medName;

private String medicineId;


private double price ;

private int quantity;

private String manufacturer;

private String batchNumber;

private Date date;


public Medicine(String medName , String medicineId, double price, int quantity  ,String manufacturer ,String batchNumber, Date date)
{
this.medName =medName;


this.medicineId =medicineId;

this.price =price;

this.quantity= quantity;


this.manufacturer =manufacturer;


this.batchNumber=batchNumber;


this.date= date;
}
public void setMedName(String medName)
{
this.medName =medName;
}
public String getMedName()
{
return medName;
}

public void setMedicineId(String medicineId)
{
this.medicineId =medicineId;}

public String getMedicineId()
{
return medicineId;
}
public void setPrice(double price)
{
this.price=price;
}
public double getPrice()
{
return price;
}
public void setQuantity(int quantity)
{
this.quantity =quantity;
}
public int getQuantity()
{
return quantity;
}
public void setManufacturer(String manufacturer)
{
this.manufacturer= manufacturer;
}
public String getManufacturer()
{
return manufacturer;
}
public void setBatchNumber(String batchNumber)
{
this.batchNumber =batchNumber;
}
public String getBatchNumber()
{
return batchNumber;
}

public void setDate(Date date)
{
this.date= date;
}
public Date getDate()
{
return date;
}
public void display()
{

System.out.println("Name of medicine" +medName);

System.out.println("medicineId" +medicineId);
System.out.println("price  " +price );
System.out.println("quantity"+quantity);

System.out.println("manufacturer" +manufacturer);

System.out.println("batchNumber" +batchNumber);

date.display();
}
}

 

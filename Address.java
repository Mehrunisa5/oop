public class Address{

private String street;

private String city;

private String postalCode;


public Address(String street , String city , String postalCode)
{
this.postalCode=  postalCode;
this.street=street;
this.city = city;
}

public void setStreet(String street)
{
this.street=street;
}
public String getStreet()
{
return street;
}
public void setCity(String city)
{
this.city = city;
}
public String getCity()
{
return city;
}
public void setPostalCode(String postalCode)
{
this.postalCode=  postalCode;
}
public String getPostalCode()
{
return postalCode;

}

public void display(){
System.out.println("City" +city + "Street" + street + "PostalCode" + postalCode);
}


}


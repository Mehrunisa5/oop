public class Person{

private String name;

private String contactNumber;

public Person( String name , String contactNumber)
{
this.name= name;

this.contactNumber= contactNumber;
}
public void setName(String name)
{
this.name = name ;

public String getName()
{
return name;
}

public void setContactNumber(String contactNumber)
{
this.contactNumber = contactNumber;
}
public string getContactNumber()
{
return contactNumber;
}
public void display()
{
System.out.println("Name of person is: "+ name);

System.out.println("Contact Number is:" + contactNumber);
}
}


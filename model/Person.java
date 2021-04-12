package model;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String address;
    private String phonenr;

    /**
     * Constructor for objects of class Person
     */
    public Person(String newName, String newAddress, String newPhone)
    {
        // initialise instance variables
        this.name = newName;
        this.address = newAddress;
        this.phonenr = newPhone;
        
    }
    
    public void setName(String name)
    {
        this.name = name;        
    }
    
    public String getName()
    {
        return name;        
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phonenr = phoneNumber;
    }
    
    public String getPhoneNumber()
    {
        return phonenr;
    }
        
    
}

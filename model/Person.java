package model;
public class Person
{
    // instance variables
    private String name;
    private String address;
    private String phonenr;
    private int postalCode;
    private String city;

    /**
     * Constructor for objects of class Person
     */
    public Person(String newName, String newAddress, String newPhone, int newPostalCode, String newCity)
    {
        // initialise instance variables
        this.name = newName;
        this.address = newAddress;
        this.phonenr = newPhone;
        this.postalCode = newPostalCode;
        this.city = newCity;
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
    
    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }
    
    public int getPostalCode()
    {
        return postalCode;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getCity()
    {
        return city;
    }    
    
    public void getPerson()
    {
        System.out.println(getName());
        System.out.println(getPhoneNumber());
        System.out.println(getAddress());
        System.out.println(getCity());
        System.out.println(getPostalCode());
    }
    
}

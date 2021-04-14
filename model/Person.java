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

    public String getName()
    {
        return name;        
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPhoneNumber()
    {
        return phonenr;
    }
    
    public int getPostalCode()
    {
        return postalCode;
    }
    
    public String getCity()
    {
        return city;
    }    
    
    public void getPersonInfo()
    {
        System.out.println(getName());
        System.out.println(getPhoneNumber());
        System.out.println(getAddress());
        System.out.println(getCity());
        System.out.println(getPostalCode());
    }
    
}

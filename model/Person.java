package model;
/**
 * Handles Person class
 */
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
    
    /**
     * Gets name of person
     * @return String name
     */
    public String getName()
    {
        return name;        
    }
    
    /**
     * Gets address of person
     * @return String address
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Gets phone number of person
     * @return String phonenr
     */
    public String getPhoneNumber()
    {
        return phonenr;
    }
    
    /**
     * Gets postal code of person
     * @return int postalCode
     */
    public int getPostalCode()
    {
        return postalCode;
    }
    
    /**
     * Gets city code of person
     * @return String city
     */
    public String getCity()
    {
        return city;
    }    
    
    /**
     * Prints info about person
     */
    public void getPersonInfo()
    {
        System.out.println(getName());
        System.out.println(getPhoneNumber());
        System.out.println(getAddress());
        System.out.println(getCity());
        System.out.println(getPostalCode());
    }
    
}

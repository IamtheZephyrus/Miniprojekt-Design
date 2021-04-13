package model;
public class Copy
{
    // instance variables - replace the example below with your own
    private int serialNumber;
    private String purchaseDate;
    private String purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate,String purchasePrice)
    {
        // initialise instance variables
        this.serialNumber= serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    /**
     * 
     */
    public int getSerialNumber()
    {
        // put your code here
        return serialNumber;
    }
}

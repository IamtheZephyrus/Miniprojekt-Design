package model;
/**
 * Handles Copy class
 */
public class Copy
{
    // instance variables
    private int serialNumber;
    private String purchaseDate;
    private String purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, String purchasePrice)
    {
        // initialise instance variables
        this.serialNumber= serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    /**
     * Returns serialNumber
     * @return int serialNumber
     */
    public int getSerialNumber()
    {
        // put your code here
        return this.serialNumber;
    }
}

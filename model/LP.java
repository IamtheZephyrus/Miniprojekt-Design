package model;
import java.util.ArrayList;
/**
 * Handles LP class
 */
public class LP
{
    // instance variables
    private String titel;
    private String artist;
    private String publicationDate;    
    private int barcode;
    private ArrayList<Copy> copies;

    /**
     * Constructor for objects of class LP
     */
    public LP(String newTitel, String newArtist, int newBarcode)
    {
        // initialise instance variables
        this.titel = newTitel;
        this.barcode = newBarcode;
        this.artist = newArtist;
        copies = new ArrayList<>();
    }

    /**
     * Adds copy to LP
     * @param Copy copy
     */
    public void addCopy(Copy copy)
    {
        copies.add(copy);        
    }

    /**
     * Gets title of LP
     * @return String titel
     */
    public String getTitel()
    {
        return titel;
    }

    /**
     * Gets barcode of LP
     * @return int barcode
     */
    public int getBarcode()
    {
        return barcode;
    }

    /**
     * Gets artist of LP
     * @return String artist
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Prints info about the LP
     */
    public void getLPInfo()
    {
        System.out.println(getArtist());
        System.out.println(getTitel());
        System.out.println(getBarcode()); 
    }

    /**
     * Searches for copy by serialnumber
     * @param int serialNumber
     * @return Copy
     */
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        Copy x = null;
        boolean finished = false;
        while(!finished)
        {
            for(Copy c : copies)
            {
                if(c.getSerialNumber() == serialNumber)
                {
                    x = c;
                    finished = true;
                }
            }
        }
        return x;
    }
}

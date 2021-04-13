package model;
import java.util.ArrayList;

public class LP
{
    // instance variables - replace the example below with your own
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
    
    public void setTitel(String titel) 
    {
        this.titel = titel;
    }
    
    public String getTitel()
    {
        return titel;
    }
    
    public void setBarcode(int barcode)
    {
        this.barcode = barcode;
    }
    
    public int getBarcode()
    {
        return barcode;
    }
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public void getCopy()
    {
        System.out.println(getArtist());
        System.out.println(getTitel());
        System.out.println(getBarcode()); 
    }

    public Copy findCopyBySerialNumber(int serialNumber)
    {
        Copy x = null;
        for(Copy c : copies)
        {
            if(c.getSerialNumber() == serialNumber)
            {
                x = c;
            }
        }
        return x;
    }
}

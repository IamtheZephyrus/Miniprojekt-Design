package model;
import java.util.ArrayList;
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

    public void addCopy(Copy copy)
    {
        copies.add(copy);
        System.out.println(copy.getSerialNumber());
        for(Copy c : copies)
        {
            System.out.println(copy.getSerialNumber());
        }
    }

    public String getTitel()
    {
        return titel;
    }

    public int getBarcode()
    {
        return barcode;
    }

    public String getArtist()
    {
        return artist;
    }

    public void getLPInfo()
    {
        System.out.println(getArtist());
        System.out.println(getTitel());
        System.out.println(getBarcode()); 
    }

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

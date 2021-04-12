package model;


public class LP
{
    // instance variables - replace the example below with your own
    private String titel;
    private String artist;
    private String publicationDate;    
    private int serialNumber;

    /**
     * Constructor for objects of class LP
     */
    public LP(String newTitel, String newArtist, int newSerieNr)
    {
        // initialise instance variables
        this.titel = newTitel;
        this.serialNumber = newSerieNr;
        this.artist = newArtist;
    }
    
    public void setTitel(String titel) 
    {
        this.titel = titel;
    }
    
    public String getTitel()
    {
        return titel;
    }
    
    public void setSerieNr(int serieNr)
    {
        this.serialNumber = serieNr;
    }
    
    public int getSerieNr()
    {
        return serialNumber;
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
        System.out.println(getSerieNr()); 
        
    }

    
}

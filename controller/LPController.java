package controller;

import model.*;
/**
 * Used for controlling LP class
 */
public class LPController
{
    // instance variables
    private LPContainer container;
    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        // initialise instance variables
        this.container = LPContainer.getInstance();
    }
    
    /**
     * Searches for copy by serialnumber
     * @param int serialNumber
     * @return Copy
     */
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        return container.findCopyBySerialNumber(serialNumber);
    }
}

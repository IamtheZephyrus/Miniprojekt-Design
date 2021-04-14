package controller;

import model.*;
/**
 * Used for controlling LP 
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
    
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        return container.findCopyBySerialNumber(serialNumber);
    }
}

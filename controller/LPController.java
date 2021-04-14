package controller;

import model.*;
/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

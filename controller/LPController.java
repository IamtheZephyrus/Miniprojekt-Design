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
    // instance variables - replace the example below with your own
    private int x;
    private LPContainer container;

    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        // initialise instance variables
        this.container = LPContainer.getInstance();
    }

    // /**
     // * 
     // */
    // public LP findCopyBySerialNumber(int serialNumber)
    // {
        // // put your code here
        // return container.findLPBySerialNumber(serialNumber);
    // }
    
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        return container.findCopyBySerialNumber(serialNumber);
    }
}

package tui;

import model.*;
/**
 * Write a description of class TryMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TryMe
{
    // instance variables - replace the example below with your own
    PersonContainer pc;
    LPContainer lpC; 
    LP l;

    /**
     * Constructor for objects of class TryMe
     */
    public TryMe()
    {
        // initialise instance variables
        pc = PersonContainer.getInstance();
        lpC = LPContainer.getInstance();
        l = new LP(null, null, 1); 
    }

    
    public void generateData()
    {
        Person tester = new Person("Monges", "Strandvejen 69", "42042069", 1337, "Aaleren");
        pc.addPerson(tester); 
        LP plade = new LP("Kandis greatest hits", "Kandis", 12345);
        Copy cp = new Copy(12345, "01-01-1970", "500mil");
        lpC.addLP(plade);
        l.addCopy(cp);    
    }   
    
    
}

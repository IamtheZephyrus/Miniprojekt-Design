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
    private PersonContainer personContainer;
    private LPContainer lpContainer; 

    /**
     * Constructor for objects of class TryMe
     */
    public TryMe()
    {
        // initialise instance variables
        personContainer = PersonContainer.getInstance();
        lpContainer = LPContainer.getInstance();
    }

    public void generateData()
    {
        Person tester = new Person("Mogens", "Strandvejen 42", "42042069", 1337, "Aalleren");
        personContainer.addPerson(tester); 
        LP plade = new LP("Kandis greatest hits", "Kandis", 12345);
        Copy cp = new Copy(12345, "01-01-1970", "500mil");
        lpContainer.addLP(plade);
        plade.addCopy(cp);
    }       
}

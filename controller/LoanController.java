package controller;
import model.*;
/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    // instance variables - replace the example below with your own
    private Person person;
    private Copy copy;
    private PersonController pController;
    private LPController lController;
    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        // initialise instance variables
        pController = new PersonController();
        lController = new LPController();
    }

    /**
     * SPLIT OP I METODER SÅ DET PASSER MED DIAGRAM
     */
    public Loan createLoan(String name, int serialNumber)
    {
        return new Loan(loanNumber, period, state,
                        person,
                        copy);
    }
    
    public void findPersonByName(String name)
    {
        this.person = pController.findPersonByName(name);
    }
    
    public void findCopyBySerialNumber(int serialNumber)
    {
        this.copy = lController.findCopyBySerialNumber(serialNumber);
    }
}

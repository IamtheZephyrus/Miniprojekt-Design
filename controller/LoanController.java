package controller;
import model.*;
/**
 * Used for controlling Loan class
 */
public class LoanController
{
    // instance variables
    private Person person;
    private Copy copy;
    private Loan loan;
    private PersonController pController;
    private LPController lController;
    private LoanContainer loanContainer;
    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        // initialise instance variables
        pController = new PersonController();
        lController = new LPController();
        loanContainer = loanContainer.getInstance();
    }
    
    /**
     * Creates loan
     */
    public Loan createLoan()
    {
        this.loan = new Loan(copy, person);
        addLoan();
        return this.loan;
    }
    
    /**
     * Adds loan to container
     */
    public void addLoan()
    {
        loanContainer.addLoan(this.loan);
    }
    
    /**
     * Searches for person by name
     * @param int serialNumber
     */
    public void findPersonByName(String name)
    {
        this.person = pController.findPersonByName(name);
    }
    
    /**
     * Searches for copy by serialnumber
     * @param int serialNumber
     */
    public void findCopyBySerialNumber(int serialNumber)
    {
        this.copy = lController.findCopyBySerialNumber(serialNumber);
    }
}

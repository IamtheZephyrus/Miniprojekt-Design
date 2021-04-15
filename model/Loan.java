package model;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Handles Loan class
 */
public class Loan
{
    // instance variables
    private LocalDate borrowDate;
    private LocalDate period;
    private String state;
    private Copy copy;
    private Person person;
    private static int loanNumber = 0;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(Copy copy, Person person)
    {
        this.borrowDate = LocalDate.now();
        this.period = borrowDate.plusDays(14);
        this.state = getState();
        this.copy = copy;
        this.person = person;
        this.state = getState();
        loanNumber++;
    }
    
    /**
     * Gets loanNumber
     * @return int loanNumber
     */
    public int getLoanNumber()
    {
        return loanNumber;
    }
    
    /**
     * Gets borrowDate
     * @return LocalDate borrowDate
     */
    public LocalDate getBorrowDate()
    {
        return this.borrowDate;
    }
    
    /**
     * Gets get period defined as borrowdate + 14 days
     * @return LocalDate period
     */
    public LocalDate getPeriod()
    {
        return period;
    }
    
    /**
     * Gets state of loan
     * State is decided depending on whether 
     * there are days left on the period from the borrowDate
     * @return String state
     */
    public String getState()
    {
        LocalDate now = LocalDate.now();
        ArrayList<String> states = populateStates();
        String state = states.get(0);
        if(period.compareTo(now) <= 0)
        {
            state = states.get(0);
        }
        else if(period.compareTo(now) > 0)
        {
            state = states.get(1);
        }
        return state;
    }
    
    /**
     * Populates and returns a list of states
     * @return ArrayList String
     */
    private ArrayList populateStates()
    {
        ArrayList<String> states = new ArrayList<>();
        states.add("Inaktivt.");
        states.add("Aktivt.");
        return states;
    }
    
}

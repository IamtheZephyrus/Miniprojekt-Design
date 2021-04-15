package model;
import java.time.LocalDate;
import java.util.ArrayList;

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
        
    public int getLoanNumber()
    {
        return loanNumber;
    }
    
    public LocalDate getBorrowDate()
    {
        return this.borrowDate;
    }
    
    public LocalDate getPeriod()
    {
        return period;
    }

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
    
    private ArrayList populateStates()
    {
        ArrayList<String> states = new ArrayList<>();
        states.add("Inaktivt.");
        states.add("Aktivt.");
        return states;
    }
    
}

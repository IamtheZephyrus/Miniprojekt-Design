package model;
import java.time.LocalDateTime;
public class Loan
{
    // instance variables - replace the example below with your own
    private LocalDateTime borrowDate;
    private String period;
    private String state;
    private Copy copy;
    private Person person;
    private static int loanNumber = 0;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(String period, String State, Copy copy, Person person)
    {
        this.borrowDate = LocalDateTime.now();
        this.period = period;
        this.state = state;
        this.copy = copy;
        this.person = person;
        loanNumber++;
    }
        
    public int getLoanNumber()
    {
        return loanNumber;
    }
    
    public LocalDateTime getBorrowDate()
    {
        return this.borrowDate;
    }
    
    public void setPeriod(String period)
    {
        this.period = period;
    }
    
    public String getPeriod()
    {
        return period;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return state;
    }
    
}

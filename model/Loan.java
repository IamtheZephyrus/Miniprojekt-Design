package model;

public class Loan
{
    // instance variables - replace the example below with your own
    private int loanNumber;
    private String borrowDate;
    private String period;
    private String state;

    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        // initialise instance variables
        
    }
    
    public void setLoanNumber(int loanNumber)
    {
        this.loanNumber = loanNumber;
    }
    
    public int getLoanNumber()
    {
        return loanNumber;
    }
    
    public void setBorrowDate(String borrowDate)
    {
        this.borrowDate = borrowDate;
    }
    
    public String getBorrowDate()
    {
        return borrowDate;
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

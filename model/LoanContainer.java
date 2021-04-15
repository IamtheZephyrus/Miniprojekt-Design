package model; 
import java.util.ArrayList;

/**
 * Contains loans after they have been created
 */
public class LoanContainer
{
    private ArrayList<Loan> loans;
    private static LoanContainer instance;  
    
    /**
     * Constructor for objects the class LoanContainer
     */
    private LoanContainer()
    {
        loans = new ArrayList<>();
    }
    
    /**
     * Singleton method
     */
    public static LoanContainer getInstance() 
    {
        if(instance == null) {
            instance = new LoanContainer();
        }
        return instance;
    }
    
    /**
     * Adds loan to the container
     */
    public void addLoan(Loan loan)
    {
        loans.add(loan);
    }

}

package tui;
import controller.LoanController;
import java.util.Scanner;
public class LoanUI
{
    // instance variables
    private Scanner scanner;
    /**
     * Constructor for objects of class LoanUI
     */
    public LoanUI()
    {
        // initialise instance variables
        scanner = new Scanner(System.in);
    }
    
    public void loanUI()
    {
        System.out.println("*** Loan Menu ***");
        System.out.println("(1) Choose borrower");
        System.out.println("(2) Choose copy");
        System.out.println("(3) Complete loan");
        System.out.println("(4) Cancel process");
        System.out.println();
        System.out.println("Choice: ");
    }
    
    
    public void createLoan(int amount)
    {    
        
    }    
}

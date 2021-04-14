package tui;
import controller.LoanController;
import java.util.Scanner;
import java.text.NumberFormat;
import model.Loan;
public class LoanUI
{
    // instance variables
    private LoanController loanController;
    private Scanner scanner;
    /**
     * Constructor for objects of class LoanUI
     */
    public LoanUI()
    {
        // initialise instance variables
        loanController = new LoanController();
        scanner = new Scanner(System.in);
    }
    
    private void loanUI()
    {
        System.out.println("*** Loan Menu ***");
        System.out.println("(1) Choose borrower");
        System.out.println("(2) Choose copy");
        System.out.println("(3) Complete loan");
        System.out.println("(4) Cancel process");
        System.out.println();
        System.out.println("Choice: ");
    }
    
    public void startMenu()
    {    
        boolean finished = false;
        loanUI();
        while(!finished)
        {
            int choice = scanner.nextInt();
            if(choice == 1)
            {
                findPerson();
            }
            else if(choice == 2)
            {
                findCopy();
            }
            else if(choice == 3)
            {
                createLoan();
            }
            else if(choice == 4)
            {
                finished = true;
            }
            else
            {
                System.out.println("Invalid input. Try again.");
            }
        }
    }    
    
    private void findPerson()
    {
        System.out.println("Type in name of the person borrowing: ");
        String name = scanner.next();
        loanController.findPersonByName(name);
    }
    
    private void findCopy()
    {
        System.out.println("Type in serialnumber of the copy being borrowed: ");
        Integer serialNumber = null;
        while(!scanner.hasNextInt())
        {
            System.out.print("Invalid input. Must be a number.");
            scanner.nextLine();  
        }
        serialNumber = scanner.nextInt();      
        loanController.findCopyBySerialNumber(serialNumber);
    }
    
    private void createLoan()
    {
        Loan l = loanController.createLoan();
        System.out.println("Loan registered and added.");
    }

}
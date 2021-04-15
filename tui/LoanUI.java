package tui;
import controller.LoanController;
import java.util.Scanner;
import java.text.NumberFormat;
import model.Loan;
/**
 * UI for loan creation
 */
public class LoanUI
{
    // instance variables
    private LoanController loanController;
    private Scanner scanner;
    private MainMenuUI main;
    
    /**
     * Constructor for objects of class LoanUI
     */
    public LoanUI()
    {
        // initialise instance variables
        loanController = new LoanController();
        scanner = new Scanner(System.in);
    }
    
    /**
     * Prints text menu for userprompts
     */
    private void loanUI()
    {
        System.out.println("*** Udlåns Menu ***");
        System.out.println("(1) Opret lån");
        System.out.println("(2) Tilbage til hoved menu ");
        System.out.println();
        System.out.print("Valg: ");
    }
    
    /**
     * Main method
     */
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
                findCopy();
                createLoan();
                loanUI();
            }
            else if(choice == 2)
            {
                finished = true;
            }
            else
            {
                System.out.println("Forkert input. Prøv igen.");
            }
        }
        MainMenuUI main = new MainMenuUI();
        main.startApp();
    }    
    
    /**
     * Finds person by name receiving the loan
     */
    private void findPerson()
    {
        System.out.println("Indtast låners navn: ");
        String name = scanner.next();
        loanController.findPersonByName(name);
    }
    
    /**
     * Finds copy of LP by serialnumber
     */
    private void findCopy()
    {
        System.out.println("Indtast serienummer på den valgte kopi: ");
        Integer serialNumber = null;
        while(!scanner.hasNextInt())
        {
            System.out.print("Forkert input. Skal være et nummer.");
            scanner.nextLine();  
        }
        serialNumber = scanner.nextInt();      
        loanController.findCopyBySerialNumber(serialNumber);
    }
    
    /**
     * Creates the loan
     */
    private void createLoan()
    {
        Loan l = loanController.createLoan();
        System.out.println("Lånet er registreret og tilføjet.\n");
    }

}
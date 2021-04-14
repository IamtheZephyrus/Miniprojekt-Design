package tui;
import java.util.Scanner;
/**
 * Write a description of class MainMenuUI here.
 *
 */
public class MainMenuUI
{
    // instance variables
    private int choice;
    private Scanner scanner;
    private LoanUI loanUI;
    private TryMe tryMe;
    /**
     * Constructor for objects of class MainMenuUI
     */
    public MainMenuUI()
    {
        scanner = new Scanner(System.in);
        loanUI = new LoanUI();
    }
    
    public void startApp()
    {
        printMenu();
        boolean finished = false;
        int choice = scanner.nextInt();
        while(!finished)
        {
            if(choice == 1)
            {
                loanUI.startMenu();
                finished = true;
            }
            if(choice == 2)
            {
                tryMe = new TryMe();
                tryMe.generateData();                
                System.out.println("Testdata genereret");
                System.out.println();
                startApp();
            }
            if(choice == 3)
            {
                finished = true;
            }
            finished = true;
        }
    }
    
    /**
     * Prints menu for user choice
     */
    private void printMenu() 
    {
        System.out.println("**** Hoved Menu ****");
        System.out.println("(1) Udlåns menu");
        System.out.println("(2) Generer testdata");
        System.out.println("(3) Luk program");
        System.out.println();
        System.out.print("Valg: ");
    }
}

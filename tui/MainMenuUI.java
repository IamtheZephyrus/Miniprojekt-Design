package tui;
import java.util.Scanner;
/**
 * Write a description of class MainMenuUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMenuUI
{
    // instance variables
    private int choice;
    private Scanner scanner;
    /**
     * Constructor for objects of class MainMenuUI
     */
    public MainMenuUI()
    {
        scanner = new Scanner(System.in);
    }
    
    public void startApp()
    {
        boolean finished = false;
        int choice = scanner.nextInt();
        printMenu();
        while(!finished)
        {
            if(choice == 1)
            {
                new LoanUI();
            }
            if(choice == 2)
            {
                // TODO IMPLEMENT TRYME CLASS
            }
            if(choice == 3)
            {
                finished = true;
            }
        }
        
    }
    
    //basic menu TUI
    public void printMenu() 
    {
        System.out.println("**** Main Menu ****");
        System.out.println("(1) Udlåns menu");
        System.out.println("(2) Generer testdata");
        System.out.println("(3) Luk program");
        System.out.println();
        System.out.println("Valg: ");
    }
}

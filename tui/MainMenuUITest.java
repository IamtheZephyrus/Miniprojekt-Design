package tui;
import controller.*;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MainMenuUITest.
 *
 */
public class MainMenuUITest
{
    /**
     * Default constructor for test class MainMenuUITest
     */
    public MainMenuUITest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestCreateData()
    {
        tui.TryMe tryMe = new tui.TryMe();
        tryMe.generateData();
        controller.LoanController loanController = new LoanController();
        loanController.findPersonByName("Mogens");
    }
}
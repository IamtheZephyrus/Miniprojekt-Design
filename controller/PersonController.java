package controller;
import model.PersonContainer;
import model.Person;
/**
 * Used for controlling Person class
 */
public class PersonController
{
    // instance variable
    private PersonContainer container;

    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        // initialise instance variables
        container = container.getInstance();
    }

    /**
     * Searches for person by name
     * @param String name
     * @return Person
     */
    public Person findPersonByName(String name)
    {
        return container.findPersonByName(name);
    }
}

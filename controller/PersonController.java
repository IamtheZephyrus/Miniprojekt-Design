package controller;
import model.PersonContainer;
import model.Person;
/**
 * Write a description of class PersonController here.
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
     * Finds person
     */
    public Person findPersonByName(String name)
    {
        return container.findPersonByName(name);
    }
}

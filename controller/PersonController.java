package controller;
import model.PersonContainer;
import model.Person;
/**
 * Write a description of class PersonController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonController
{
    // instance variable
    private PersonContainer personContainer;

    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        // initialise instance variables
        personContainer = personContainer.getInstance();
    }

    /**
     * Finds person
     */
    public Person findPersonByName(String name)
    {
        return personContainer.findPersonByName(name);
    }
}

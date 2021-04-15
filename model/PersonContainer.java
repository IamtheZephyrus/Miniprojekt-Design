package model; 
import java.util.ArrayList;
/**
 * Contains Person after they're created
 */
public class PersonContainer
{
    private ArrayList<Person> persons;
    private static PersonContainer instance;
    
    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer()
    {
        persons = new ArrayList<>();       
    }
    
    /**
     * Singleton method
     */
    public static PersonContainer getInstance() 
    {
        if(instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }
    
    /**
     * Searches for person by name
     * @param String name
     * @return Person
     */
    public Person findPersonByName(String name)
    {
        Person x = null;
        for(Person p : persons)
        {
            if(p.getName().equals(name))
            {
                x = p;
            }
        }
        return x;
    }
    
    /**
     * Adds person to the container
     */
    public void addPerson(Person person)
    {
        persons.add(person);
    }
}

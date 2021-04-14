package model; 
import java.util.ArrayList;
public class PersonContainer
{
    private ArrayList<Person> persons;
    private static PersonContainer instance;
    
    private PersonContainer()
    {
        persons = new ArrayList<>();       
    }
    
    public static PersonContainer getInstance() 
    {
        if(instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }
    
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
    
    public void addPerson(Person person)
    {
        persons.add(person);
    }
    
}

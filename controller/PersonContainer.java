package controller; 
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
    
}

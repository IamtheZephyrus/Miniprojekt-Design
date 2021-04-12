package controller; 
public class PersonContainer
{
    private static PersonContainer personcontainer = null;
    
    public PersonContainer()
    {
       
    }
    
    public static PersonContainer getInstance() 
    {
        if(personcontainer == null) {
            personcontainer = new PersonContainer();
        }
        return personcontainer;
    }
    
}

package model;
import java.util.ArrayList;
/**
 * Contains LP after they're created
 */
public class LPContainer
{
    private ArrayList<LP> LPs;
    private static LPContainer instance;
    
    /**
     * Constructor for objects of class LP
     */
    private LPContainer()
    {
        LPs = new ArrayList<>();        
    }
    
    /**
     * Singleton method
     */
    public static LPContainer getInstance() 
    {
        if(instance == null) 
        {
            instance = new LPContainer();
        }
        return instance;
    }
    
    /**
     * Searches for copy by serialnumber
     * @param int serialNumber
     * @return Copy
     */
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        Copy c = null;
        boolean finished = false;
        while(!finished)
        {
            for (LP lp : LPs)
            {
                c = lp.findCopyBySerialNumber(serialNumber);
                finished = true;
            }
        }
        return c;
    }
    
    /**
     * Adds LP to the container
     */
    public void addLP(LP lp)
    {
        LPs.add(lp);
    }
}

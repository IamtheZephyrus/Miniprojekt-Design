package model;
import java.util.ArrayList;
public class LPContainer
{
    private ArrayList<LP> LPs;
    private static LPContainer instance;
    private LPContainer()
    {
        LPs = new ArrayList<>();        
    }
    
    public static LPContainer getInstance() 
    {
        if(instance == null) 
        {
            instance = new LPContainer();
        }
        return instance;
    }
    
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
    
    public void addLP(LP lp)
    {
        LPs.add(lp);
    }
}

package controller;
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
        if(instance == null) {
            instance = new LPContainer();
        }
        return instance;
    }

    
}

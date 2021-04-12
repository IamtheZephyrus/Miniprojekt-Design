package controller;

public class LPContainer
{
    private static LPContainer lpcontainer = null;
    
    public LPContainer()
    {
        
    }
    public static LPContainer getInstance() 
    {
        if(lpcontainer == null) {
            lpcontainer = new LPContainer();
        }
        return lpcontainer;
    }

    
}

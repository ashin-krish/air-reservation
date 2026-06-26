package util;

public class AdminIdGenerator 
{
    
    private static int idCounter = 0;

    public static int idGenerator()
    {
        return ++idCounter;
    }

}

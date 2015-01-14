
/**
 * Write a description of class TeWeinigGeldException here.
 * 
 * @author Daniel en Tjeerd  
 */
public class TeWeinigGeldException extends Exception
{
   String message;
   /**
     * Constructor for objects of class TeWeinigGeldException
     */
    public TeWeinigGeldException()
    {
    }
   /**
     * Constructor TeWeinigGeldException(Exception e)
     */
    public TeWeinigGeldException(Exception e) {
    }
   /**
     * Constructor TeWeinigGeldException(String message)
     */
    public TeWeinigGeldException(String message)
   {
       this.message = message;
    }
    
    /**
     * Methode om de foutmelding te printen
     */
    public void printFoutmelding(){
        System.out.println(message);
    }
}

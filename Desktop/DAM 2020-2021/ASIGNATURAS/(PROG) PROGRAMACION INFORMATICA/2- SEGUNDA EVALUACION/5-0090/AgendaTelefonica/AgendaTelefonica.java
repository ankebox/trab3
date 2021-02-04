import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> agenda;
    
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // initialise instance variables
        agenda = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void enterNumber(String deName, String deNumber){
        String name = deName;
        String number = deNumber;
        agenda.put(name, number);
        
    }
    
    public String lookupNumber(String deName){
        String name = deName;
        
        return agenda.get(name);
    }
}

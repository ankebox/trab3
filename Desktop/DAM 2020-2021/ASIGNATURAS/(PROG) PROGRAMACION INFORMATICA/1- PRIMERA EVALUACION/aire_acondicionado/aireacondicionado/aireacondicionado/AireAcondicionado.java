
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
   
    private double temperatura;
    
    
    public AireAcondicionado()
    {
        temperatura = 15.0;
    }
    
    public void subirTemperatura(){
        temperatura = temperatura + 5.0;
    }
    
    public void bajarTemperatura(){
        temperatura = temperatura - 5.0;
    }
    
    public double getTemperatura(){
        return temperatura;
    }
}

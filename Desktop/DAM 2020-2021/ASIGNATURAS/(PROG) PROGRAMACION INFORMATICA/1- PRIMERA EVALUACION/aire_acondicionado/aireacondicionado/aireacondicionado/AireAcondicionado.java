
/**
 * Write a description of class AireAcondicionado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AireAcondicionado
{
   
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    
    public AireAcondicionado(double minDe, double maxDe)
    {
        temperatura = 15.0;
        incremento = 5.0;
        min = minDe;
        max = maxDe;
    }
    
    public void subirTemperatura(){
        if(temperatura + incremento < max){
            temperatura = temperatura + incremento;
        }   
    }
    
    public void bajarTemperatura(){
        if(temperatura - incremento > min){
            temperatura = temperatura - incremento;
        }
    }
    
    public double getTemperatura(){
        return temperatura;
    }
    
    public void setIncremento(double incrementoDe){
        if(incrementoDe > 0){
            incremento = incrementoDe;
        }
    }
}


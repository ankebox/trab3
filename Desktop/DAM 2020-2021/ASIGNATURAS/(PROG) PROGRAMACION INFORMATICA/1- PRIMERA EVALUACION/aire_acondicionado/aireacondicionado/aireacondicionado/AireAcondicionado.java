
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
    private int cambioTemperatura;
    private double maxLlegado;
    private double minLlegado;
    public AireAcondicionado(double minDe, double maxDe)
    {
        temperatura = 15.0;
        incremento = 5.0;
        min = minDe;
        max = maxDe;
        cambioTemperatura = 0;
        maxLlegado = temperatura;
        minLlegado = temperatura;
    }
    
    public void subirTemperatura(){
        
        if(temperatura + incremento <= max){
            temperatura = temperatura + incremento;
            cambioTemperatura = cambioTemperatura + 1;
            maxLlegado = maxLlegado + incremento;
        }   
    }
    
    public void bajarTemperatura(){
        if(temperatura - incremento >= min){
            temperatura = temperatura - incremento;
            cambioTemperatura = cambioTemperatura + 1;
            minLlegado = minLlegado - incremento;
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
    
    public void mostrarEstadisticas(){
        System. out. println("Temperatura actual: " + temperatura + " temperatura minima seleccionada: " + minLlegado + " Temperatura maxima seleccionada: " + maxLlegado + " Temperatura Cambiada " + cambioTemperatura + " veces." );
    }
    
    public String getEstadisticas(){
        return ("Temperatura actual: " + temperatura + " temperatura minima seleccionada: " + minLlegado + " Temperatura maxima seleccionada: " + maxLlegado + " Temperatura Cambiada " + cambioTemperatura + " veces." );
    }
}


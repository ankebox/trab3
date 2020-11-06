
public class cale
{
    
    private int dia;
    private int mes;
    private int año;
    
   
    public cale()
    {
        dia = 1;
        mes = 1;
        año = 1;
    }
    
    public String obtenerFecha(){
        return (dia + " - " + mes + " - " + año);
    }
    
    public void fijarFecha(int diaDe, int mesDe, int añoDe){
        dia = diaDe;
        mes = mesDe;
        año = añoDe;
    }
    
    public void avanzarFecha(){
        dia = dia + 1;
        if(dia == 31){
            mes = mes +1;
            dia = 1;
            if(mes == 13){
                    año = año + 1;
                    mes = 1;
                    if(año == 100){
                        año = 1;
                    }
            }
        }
        
        
    }
    
}

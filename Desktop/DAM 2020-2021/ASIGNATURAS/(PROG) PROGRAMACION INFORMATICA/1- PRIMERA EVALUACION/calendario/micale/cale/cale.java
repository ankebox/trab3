
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
        String jdrDia = "";
        String jdrMes = "";
        String jdrAño = "";
        if(dia < 10){
            jdrDia = "0" + dia;
        }
        else{
            jdrDia = "" + dia;
        }
        if(mes < 10){
            jdrMes = "0" + mes;
        }
        else{
            jdrMes = "" + mes;
        }
        if(año < 10){
            jdrAño = "0" + año;
        }
        else{
            jdrAño = "" + año;
        }
    return (jdrDia + " - " + jdrMes + " - " + jdrAño);
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

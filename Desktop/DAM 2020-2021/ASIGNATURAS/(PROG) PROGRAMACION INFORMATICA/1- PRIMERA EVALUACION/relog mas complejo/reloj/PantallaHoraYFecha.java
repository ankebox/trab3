

public class PantallaHoraYFecha
{
    
    private PantallaDosDigitos pantallaHora;
    private PantallaDosDigitos pantallaMinuto;
    private PantallaDosDigitos pantallaDia;
    private PantallaDosDigitos pantallaMes;
    private PantallaDosDigitos pantallaAño;
    
    

    
    public PantallaHoraYFecha(){
    
        pantallaHora = new PantallaDosDigitos(0, 24);
        pantallaMinuto = new PantallaDosDigitos(0, 60);
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAño = new PantallaDosDigitos(1, 100);
       
    }
    
    public String getFechaYHora(){
        return pantallaHora.getTextoDeLaPantalla() + ":" + pantallaMinuto.getTextoDeLaPantalla() + " " + pantallaDia.getTextoDeLaPantalla() + "-" + pantallaMes.getTextoDeLaPantalla() + "-" + pantallaAño.getTextoDeLaPantalla();
    }
    
    public void avanzarMinuto(){
        pantallaMinuto.incrementaValorAlmacenado();
        if(pantallaMinuto.getValorAlmacenado() == 0){
            pantallaHora.incrementaValorAlmacenado();
            if(pantallaHora.getValorAlmacenado() == 0){
                pantallaDia.incrementaValorAlmacenado();
                if(pantallaDia.getValorAlmacenado() == 1) {
                    pantallaMes.incrementaValorAlmacenado(); 
                    if(pantallaMes.getValorAlmacenado() == 1) {
                     pantallaAño.incrementaValorAlmacenado();
                    }
                }
            }
        }   
    }

    public void fijarFechaYHora(int horaDe, int minutoDe, int diaDe, int mesDe, int añoDe){
        pantallaHora.setValorAlmacenado(horaDe);
        pantallaMinuto.setValorAlmacenado(minutoDe);
        pantallaDia.setValorAlmacenado(diaDe);
        pantallaMes.setValorAlmacenado(mesDe);
        pantallaAño.setValorAlmacenado(añoDe);
    }


}

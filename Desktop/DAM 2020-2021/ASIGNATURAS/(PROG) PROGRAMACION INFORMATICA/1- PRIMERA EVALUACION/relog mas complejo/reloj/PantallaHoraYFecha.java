

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
        pantallaDia = new PantallaDosDigitos(1, 30);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaAño = new PantallaDosDigitos(1, 99);
       
    }
    
    public String getFechaYHora(){
        return pantallaHora.getTextoDeLaPantalla() + ":" + pantallaMinuto.getTextoDeLaPantalla() + " " + pantallaDia.getTextoDeLaPantalla() + "-" + pantallaMes.getTextoDeLaPantalla() + "-" + pantallaAño.getTextoDeLaPantalla();
    }
    
    public void avanzarMinuto(){
        pantallaMinuto.incrementaValorAlmacenado();
    }

    public void fijarFechaYHora(int horaDe, int minutoDe, int diaDe, int mesDe, int añoDe){
        pantallaHora.setValorAlmacenado(horaDe);
        pantallaMinuto.setValorAlmacenado(minutoDe);
        pantallaDia.setValorAlmacenado(diaDe);
        pantallaMes.setValorAlmacenado(mesDe);
        pantallaAño.setValorAlmacenado(añoDe);
    }


}

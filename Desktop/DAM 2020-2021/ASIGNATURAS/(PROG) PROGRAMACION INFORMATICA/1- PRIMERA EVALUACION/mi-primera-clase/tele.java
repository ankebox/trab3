public class tele {

    private String dueño;
    private int numeroCanales;
    private boolean teleConectada;

    public tele(String dueñoDe, int numeroCanalesDe) {
        dueño = dueñoDe;
        numeroCanales = numeroCanalesDe;
        teleConectada = true;

    } 

    public String getDueño() {
        return dueño;
    }
    
    public int getNumeroCanales() {
        return numeroCanales; 
    }

    public boolean getTeleConectada() {
        return teleConectada;
    }

    public void setDueño(String dueñoDe) {
        dueño = dueñoDe;
    
    }

    public void numeroCanalesAñadidos(int numeroCanalesAñadir){
        numeroCanales = numeroCanales + numeroCanalesAñadir;
    }
    
    
    public void encenderTele(boolean teleConectadaDe){
        teleConectada = teleConectadaDe;
    }
    
    public void imprimirDetalles(){
        System. out. println("el dueño de la tele es ");
        System. out. println(dueño);
        System. out. println("la television tiene un total de  ");
        System. out. println(numeroCanales + "canales");
        System. out. println("la tele esta encendida :" + teleConectada);
    }
    
}

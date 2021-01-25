
import java.util.Random;
public class RandomTester
{
   
    

    
    public RandomTester()
    {
        
    }

    
    public void printOneRandom(){
        Random generador = new Random();
        int numeroGenerado = generador.nextInt();
        System.out.println(numeroGenerado);
    }
    
    public void printMultiRandom(int deCantidad) {
        int cantidad = deCantidad - 1;
        Random generador = new Random();
        int contador = 0;
        while (contador <= cantidad) {
            int numeroGenerado = generador.nextInt();
            System.out.println(numeroGenerado);
            contador = contador + 1;
        }
    }
    
    public void lanzarDado() {
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(6);
        numeroAleatorio = numeroAleatorio + 1;
        System.out.println(numeroAleatorio);
    }
    
    public void getRespuesta() {
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(3);
        if (numeroAleatorio == 0) {
            System.out.println("si");
        }
        else {
            if (numeroAleatorio == 1) {
                System.out.println("no");
            }
            else {
                System.out.println("quizas");
            }
        }
    }
    
    public void getNumeroEntre0Y (int deMaximo) {
        Random generador = new Random();
        int maximo = deMaximo;
        int numeroAleatorio = generador.nextInt(maximo);
        numeroAleatorio = numeroAleatorio + 1;
        System.out.println(numeroAleatorio);
    }
    
    public void getNumeroEntre (int deMinimo, int deMaximo) {
        Random generador = new Random();
        int maximo =  deMaximo;
        int minimo = deMinimo;
        int numeroAleatorio = minimo + generador.nextInt((maximo + 1) - minimo);
        System.out.println(numeroAleatorio);
    }
}

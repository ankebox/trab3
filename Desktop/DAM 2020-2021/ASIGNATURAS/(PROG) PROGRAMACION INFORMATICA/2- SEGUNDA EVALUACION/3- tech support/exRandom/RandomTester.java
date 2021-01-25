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
}

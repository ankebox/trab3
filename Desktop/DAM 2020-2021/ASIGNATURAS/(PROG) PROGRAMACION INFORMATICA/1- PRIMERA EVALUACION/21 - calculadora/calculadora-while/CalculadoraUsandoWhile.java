
/**
 * Write a description of class CalculadoraUsandoWhile here.
 * 
 * @author (ankebox) 
 * @version (1.00)
 */
public class CalculadoraUsandoWhile
{
    
    

    /**
     * Constructor for objects of class CalculadoraUsandoWhile
     */
    public CalculadoraUsandoWhile()
    {
       
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void multiplosDeCinco()
    {
       int refer = 15;
       while (refer <= 90) {
           System. out. println(refer);
           refer = refer + 5;
        }
    }
    
    public void sumaDeValores() {
        int refer = 0;
        int total = 0;
        while (refer < 10) {
            refer = refer + 1;
            total = total + refer;
        }
        System. out. println(total);
    }
     
    public int sumaDeValoresEnElIntervalo (int a, int b){
        int reserva = 0;
        int resultado = a;
        int total = 0;
        if((a >= 0 ) && ( b >= 0)){
            if (a > b) {
                reserva = a;
                a = b;
                b = reserva;
                resultado = a;
            }
            int numero = a;
            while (numero < b) {
                numero = numero + 1;
                resultado = resultado + numero;
            }
            total = resultado;
        }
        else{
            System. out. println("error, introduzca solo numeros positivos");
            resultado = -1;
           
            total = resultado;
        }
        return total;
    }
    
    public boolean esPrimo (int a) {
        boolean primo = true;
        int dividendo = 2;
        int noPrimo = 0;
        while ((dividendo < a - 1) && (primo == true)){
            
            if (noPrimo == (a % dividendo)) {
                primo = false;
            }
           
            dividendo = dividendo + 1;
        }
        
        return primo;
    }
}


/**
 * Write a description of class ComprobadorDeMultiplos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComprobadorDeMultiplos
{
    public boolean esMultiploDe2(int a){
        boolean mul2 = false;
        if(a < 2){
            mul2 = false;
        }
        else{
            if(a % 2 == 0){
                mul2 = true;
            }
            else{
                mul2 = false;
            }
        }
        return mul2;
    }
    
    public boolean esMultiploDe5(int a){
        boolean mul5 = false;
        if(a < 5){
            mul5 = false;
        }
        else{
            if(a % 5 == 0){
                mul5 = true;
            }
            else{
                mul5 = false;
            }
        }
        return mul5;
    }
    
    public boolean esMultiploDe(int a, int b){
        boolean mul = false;
        if(a < b || b == 0 || (a < 0 || b < 0)){
            mul = false;
        }
        else{
            if(a % b == 0){
                mul = true;
            }
            else{
                mul = false;
            }
        }
        return mul;
    }
    
    
}

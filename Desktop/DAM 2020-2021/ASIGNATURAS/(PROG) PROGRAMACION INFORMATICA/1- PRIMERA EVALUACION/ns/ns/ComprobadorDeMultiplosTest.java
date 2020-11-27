import static org.junit.Assert.*;
import org.junit.Test;

public class ComprobadorDeMultiplosTest
{
    @Test
    public void testMetodo01()
    {
        ComprobadorDeMultiplos comproba1 = new ComprobadorDeMultiplos();
        assertEquals(true, comproba1.esMultiploDe2(2));
        assertEquals(false, comproba1.esMultiploDe2(0));
        assertEquals(false, comproba1.esMultiploDe2(1));
        assertEquals(false, comproba1.esMultiploDe2(-3));
        assertEquals(false, comproba1.esMultiploDe2(-5));
        assertEquals(false, comproba1.esMultiploDe2(3));
        assertEquals(true, comproba1.esMultiploDe2(4));
        assertEquals(false, comproba1.esMultiploDe2(7));
        assertEquals(true, comproba1.esMultiploDe2(8));
        assertEquals(false, comproba1.esMultiploDe2(17));
        assertEquals(true, comproba1.esMultiploDe2(16));
        assertEquals(false, comproba1.esMultiploDe2(5));
        assertEquals(true, comproba1.esMultiploDe2(10));
        assertEquals(false, comproba1.esMultiploDe2(9));
        assertEquals(true, comproba1.esMultiploDe2(28));
        assertEquals(false, comproba1.esMultiploDe2(37));
        assertEquals(true, comproba1.esMultiploDe2(48));        
    }
    
    @Test
    public void testMetodo02()
    {
        ComprobadorDeMultiplos comproba1 = new ComprobadorDeMultiplos();
        assertEquals(true, comproba1.esMultiploDe5(5));
        assertEquals(false, comproba1.esMultiploDe5(4));
        assertEquals(false, comproba1.esMultiploDe5(3));
        assertEquals(false, comproba1.esMultiploDe5(2));
        assertEquals(false, comproba1.esMultiploDe5(1));
        assertEquals(false, comproba1.esMultiploDe5(0));
        assertEquals(false, comproba1.esMultiploDe5(-3));
        assertEquals(false, comproba1.esMultiploDe5(-5));
        assertEquals(false, comproba1.esMultiploDe5(8));
        assertEquals(true, comproba1.esMultiploDe5(10));
        assertEquals(false, comproba1.esMultiploDe5(12));
        assertEquals(true, comproba1.esMultiploDe5(15));
        assertEquals(false, comproba1.esMultiploDe5(17));
        assertEquals(true, comproba1.esMultiploDe5(20));
        assertEquals(false, comproba1.esMultiploDe5(23));
        assertEquals(true, comproba1.esMultiploDe5(25));
        assertEquals(false, comproba1.esMultiploDe5(29));
        assertEquals(true, comproba1.esMultiploDe5(30));
        assertEquals(false, comproba1.esMultiploDe5(37));
        assertEquals(true, comproba1.esMultiploDe5(40));        
    }  
    
    @Test
    public void testMetodo03()
    {
        ComprobadorDeMultiplos comproba1 = new ComprobadorDeMultiplos();
        assertEquals(false, comproba1.esMultiploDe(-2, -3));
        assertEquals(false, comproba1.esMultiploDe(-2, 0));
        assertEquals(false, comproba1.esMultiploDe(0, -5));
        assertEquals(false, comproba1.esMultiploDe(0, 0));
        assertEquals(false, comproba1.esMultiploDe(1, 0));
        assertEquals(false, comproba1.esMultiploDe(0, 1));
        assertEquals(false, comproba1.esMultiploDe(1, 3));
        assertEquals(false, comproba1.esMultiploDe(4, 10));
        assertEquals(true, comproba1.esMultiploDe(5, 5));
        assertEquals(true, comproba1.esMultiploDe(10, 5));
        assertEquals(false, comproba1.esMultiploDe(12, 5));
        assertEquals(true, comproba1.esMultiploDe(14, 14));
        assertEquals(false, comproba1.esMultiploDe(17, 2));
        assertEquals(true, comproba1.esMultiploDe(20, 4));
        assertEquals(false, comproba1.esMultiploDe(23, 4));
        assertEquals(true, comproba1.esMultiploDe(25, 5));
        assertEquals(false, comproba1.esMultiploDe(29, 2));
        assertEquals(true, comproba1.esMultiploDe(30, 6));
        assertEquals(false, comproba1.esMultiploDe(37, 2));
        assertEquals(true, comproba1.esMultiploDe(40, 8));        
    }     
}

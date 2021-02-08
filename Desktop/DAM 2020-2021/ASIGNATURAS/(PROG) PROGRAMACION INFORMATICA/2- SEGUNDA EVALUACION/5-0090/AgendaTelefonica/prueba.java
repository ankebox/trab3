

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class prueba
{
    private AgendaTelefonica agendaTe1;

    /**
     * Default constructor for test class prueba
     */
    public prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        agendaTe1 = new AgendaTelefonica();
        agendaTe1.enterNumber("david", "623105649");
        agendaTe1.enterNumber("lucia", "632526854");
        agendaTe1.enterNumber("Zinthia", "635945612");
        agendaTe1.enterNumber("helena", "575456965");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

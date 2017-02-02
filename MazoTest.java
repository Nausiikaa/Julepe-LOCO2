

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MazoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MazoTest
{
    private Mazo mazo1;

    /**
     * Default constructor for test class MazoTest
     */
    public MazoTest()
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
        
        
        mazo1 = new Mazo();
        mazo1.verCartasDelMazo();
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

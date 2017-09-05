package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import taschenrechner.Taschenrechner;
import taschenrechner.TaschenrechnerException;

public class TaschenrechnerTest {

	@Test
    public void addieren() {
        Taschenrechner taschenrechner = new Taschenrechner();

        // assert statements
        assertEquals("6 + 1 ist 7", 7, taschenrechner.addieren(6, 1));
        assertEquals("3 + 4 ist 7", 7, taschenrechner.addieren(3, 4));
        assertEquals("-5 + 3 ist -2", -2, taschenrechner.addieren(-5, 3));
        assertEquals("3 + -2 ist 1", 1, taschenrechner.addieren(3, -2));
    }
	
	@Test
    public void subtrahieren() {
        Taschenrechner taschenrechner = new Taschenrechner();

        // assert statements
        assertEquals("6 - 1 ist 5", 5, taschenrechner.subtrahieren(6, 1));
        assertEquals("3 - 4 ist -1", -1, taschenrechner.subtrahieren(3, 4));
        assertEquals("-3 - -3 ist 0", 0, taschenrechner.subtrahieren(-3, -3));
        assertEquals("0 - 0 ist 0", 0, taschenrechner.subtrahieren(0, 0));
    }
	
	@Test
    public void multiplikation() {
        Taschenrechner taschenrechner = new Taschenrechner();

        // assert statements
        assertEquals("6 x 1 ist 6", 6, taschenrechner.multiplizieren(6, 1));
        assertEquals("3 x 4 ist 12", 12, taschenrechner.multiplizieren(3, 4));
        assertEquals("10 x 0 ist 0", 0, taschenrechner.multiplizieren(10, 0));
        assertEquals("0 x 0 ist 0", 0, taschenrechner.multiplizieren(0, 0));
    }
	
	@Test
    public void dividieren() throws TaschenrechnerException {
        Taschenrechner taschenrechner = new Taschenrechner();

        // assert statements
        assertEquals("4 / 2 ist 2", 2, taschenrechner.dividieren(4, 2));
        assertEquals("5 / 2 ist 2", 2, taschenrechner.dividieren(5, 2));
    }
    
	@Test(expected = TaschenrechnerException.class)
    public void dividierenDurchNull() throws TaschenrechnerException {
        Taschenrechner taschenrechner = new Taschenrechner();
        assertEquals("6 / 0 = Exception", 6, taschenrechner.dividieren(6, 0));
    }
	
}

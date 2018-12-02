package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DroneTest.
 */
public class DroneTest {

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test getter setters.
	 */
	@Test
	public void testGetterSetters() {
		Drone a1 = new Drone("abc", "delta", 1996, 10000, 8, 100);
		
		assertEquals(8, a1.getNumWings());
		a1.setNumWings(-1);
		assertEquals(8, a1.getNumWings());
		a1.setNumWings(11);
		assertEquals(8, a1.getNumWings());
		a1.setNumWings(5);
		assertEquals(5, a1.getNumWings());
		
		assertEquals(100, a1.getMaxRange());
		a1.setMaxRange(-1);
		assertEquals(100, a1.getMaxRange());
		a1.setMaxRange(200);
		assertEquals(200, a1.getMaxRange());
		
		assertEquals("Drone : [abc] [delta] [1996] [10000] [5] [200]", a1.toString());
	}

}

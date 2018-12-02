package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class RocketTest.
 */
public class RocketTest {

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		Rocket a1 = new Rocket("abc", "delta", 1996, 10000, "moon", 5);
		
		assertEquals("moon", a1.getDestination());
		a1.setDestination("mars");
		assertEquals("mars", a1.getDestination());
		
		assertEquals(5, a1.getCapacity());
		a1.setCapacity(3);
		assertEquals(3, a1.getCapacity());
		a1.setCapacity(-1);
		assertEquals(3, a1.getCapacity());
		a1.setCapacity(11);
		assertEquals(3, a1.getCapacity());
			
		assertEquals("Rocket : [abc] [delta] [1996] [10000] [mars] [3]", a1.toString());
	}

}

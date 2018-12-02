package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class AirObjectTest.
 */
public class AirObjectTest {
	

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * Test compare to.
	 */
	@Test
	public void testCompareTo() {
		AirObject a1 = new AirObject("abc", "delta", 1996, 10000);
		AirObject a2 = new AirObject("abd", "delta", 1996, 10000);
		AirObject a3 = new AirObject("aac", "delta", 1996, 10000);
		AirObject a4 = new AirObject("abc", "delta", 1996, 10000);
		assertEquals(-1, a1.compareTo(a2));
		assertEquals(1, a1.compareTo(a3));
		assertEquals(0, a1.compareTo(a4));
		
	}
	
	/**
	 * Test getter setters.
	 */
	@Test
	public void testGetterSetters() {
		AirObject a1 = new AirObject("abc", "delta", 1996, 10000);
		assertEquals("abc", a1.getName());
		a1.setName("aba");
		assertEquals("aba", a1.getName());
		
		assertEquals("delta", a1.getCompany());
		a1.setCompany("asiana");
		assertEquals("asiana", a1.getCompany());
		
		assertEquals(1996, a1.getYear());
		a1.setYear(1999);
		assertEquals(1999, a1.getYear());
		
		assertEquals(10000, a1.getMaxHeight());
		a1.setMaxHeight(15000);
		assertEquals(15000, a1.getMaxHeight());
		
		a1.setName("");
		assertEquals("aba", a1.getName());
		
		a1.setCompany("");
		assertEquals("asiana", a1.getCompany());
		
		a1.setYear(-1);
		assertEquals(1999, a1.getYear());
		a1.setYear(2200);
		assertEquals(1999, a1.getYear());
		
		a1.setMaxHeight(-1);
		assertEquals(15000, a1.getMaxHeight());
		
		assertEquals("AirObject : [aba] [asiana] [1999] [15000]", a1.toString());
		

	}
	
	/**
	 * Test compareto.
	 */
	@Test
	public void testCompareto() {
		AirObject a1 = new Drone("dragon_drone", "delta", 1996, 10000, 5, 200);
		AirObject a2 = new Rocket("nasa_rocket", "delta", 1996, 10000, "mars", 3);
		AirObject a3 = new AI_Bird("dumb_bird", "delta", 1996, 10000, "parrot", "reconnaissance");
		AirObject a4 = new Airplane("cannot_fly", "delta", 1996, 10000, "USA", 70, "Mike");
		AirObject a5 = new Ad_Balloon("ad_bomb", "delta", 1996, 10000, "Google", 30, 10);
		
		assertEquals("Drone : [dragon_drone] [delta] [1996] [10000] [5] [200]", a1.toString());
		assertEquals("Rocket : [nasa_rocket] [delta] [1996] [10000] [mars] [3]", a2.toString());
		assertEquals("AI_Bird : [dumb_bird] [delta] [1996] [10000] [parrot] [reconnaissance]", a3.toString());
		assertEquals("Airplane : [cannot_fly] [delta] [1996] [10000] [USA] [70] [Mike]", a4.toString());
		assertEquals("Ad_Balloon : [ad_bomb] [delta] [1996] [10000] [Google] [30] [10]", a5.toString());
		
		assertEquals(-1, a1.compareTo(a2));
		assertEquals(-1, a1.compareTo(a3));
		assertEquals(1, a1.compareTo(a4));
		assertEquals(1, a1.compareTo(a5));
	
	}

	
}

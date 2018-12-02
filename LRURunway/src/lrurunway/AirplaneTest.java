package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Airplane a1 = new Airplane("abc", "delta", 1996, 10000, "South Korea", 50, "James");
		
		assertEquals("South Korea", a1.getDestination());
		a1.setDestination("USA");
		assertEquals("USA", a1.getDestination());
		
		assertEquals(50, a1.getCapacity());
		a1.setCapacity(70);
		assertEquals(70, a1.getCapacity());
		a1.setCapacity(100);
		assertEquals(70, a1.getCapacity());
		a1.setCapacity(-1);
		assertEquals(70, a1.getCapacity());
		
		assertEquals("James", a1.getPilot());
		a1.setPilot("Mike");
		assertEquals("Mike", a1.getPilot());
		
		assertEquals("Airplane : [abc] [delta] [1996] [10000] [USA] [70] [Mike]", a1.toString());
	}

}

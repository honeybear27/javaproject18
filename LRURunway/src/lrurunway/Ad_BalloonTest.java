package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ad_BalloonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Ad_Balloon a1 = new Ad_Balloon("abc", "delta", 1996, 10000, "Microsoft", 50, 15);

		assertEquals("Microsoft", a1.getAd_company());
		a1.setAd_company("Google");
		assertEquals("Google", a1.getAd_company());

		assertEquals(50, a1.getRadius());
		a1.setRadius(30);
		assertEquals(30, a1.getRadius());
		a1.setRadius(-1);
		assertEquals(30, a1.getRadius());
		a1.setRadius(200);
		assertEquals(30, a1.getRadius());

		assertEquals(15, a1.getCapacity());
		a1.setCapacity(10);
		assertEquals(10, a1.getCapacity());
		a1.setCapacity(40);
		assertEquals(10, a1.getCapacity());
		a1.setCapacity(-1);
		assertEquals(10, a1.getCapacity());

		assertEquals("Ad_Balloon : [abc] [delta] [1996] [10000] [Google] [30] [10]", a1.toString());
	}

}

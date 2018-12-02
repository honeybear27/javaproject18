package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class AI_BirdTest.
 */
public class AI_BirdTest {

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
		AI_Bird a1 = new AI_Bird("abc", "delta", 1996, 10000, "hawk", "fun");
		
		assertEquals("hawk", a1.getType());
		a1.setType("parrot");
		assertEquals("parrot", a1.getType());
		
		assertEquals("fun", a1.getPurpose());
		a1.setPurpose("reconnaissance");
		assertEquals("reconnaissance", a1.getPurpose());
		
		assertEquals("AI_Bird : [abc] [delta] [1996] [10000] [parrot] [reconnaissance]", a1.toString());
	}

}

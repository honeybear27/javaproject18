package polymorphism;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExternalContractorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetHourlyRate() {
		ExternalContractor emp1 = new ExternalContractor("Ronald", 10);
		
		assertEquals(38.50, emp1.getHourlyRate(1), 0.01);
		assertEquals(41.75, emp1.getHourlyRate(2), 0.01);
		assertEquals(45.50, emp1.getHourlyRate(3), 0.01);
		assertEquals(45.50, emp1.getHourlyRate(4), 0.01);
	}
	
	@Test
	public void testWeeklyPay() {
		ExternalContractor emp1 = new ExternalContractor("Ronald", 10);

		assertEquals(154, emp1.weeklyPay(4, 1), 0.01);
		assertEquals(167, emp1.weeklyPay(4, 2), 0.01);
		assertEquals(182, emp1.weeklyPay(4, 3), 0.01);
		assertEquals(182, emp1.weeklyPay(4, 4), 0.01);

	}

}

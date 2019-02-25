package polymorphism;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartTimeEmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetHoursWorked() {
		PartTimeEmployee emp1 = new PartTimeEmployee("Ronald", 3, 7);
		PartTimeEmployee emp2 = new PartTimeEmployee("Mike", 10, 17);
		
		assertEquals(7, emp1.getHoursWorked());
		assertEquals(17, emp2.getHoursWorked());
		
	}
	
	@Test
	public void testWeeklyPay() {
		PartTimeEmployee emp1 = new PartTimeEmployee("Ronald", 3, 7);
		PartTimeEmployee emp2 = new PartTimeEmployee("Mike", 10, 17);
		
		assertEquals(21, emp1.weeklyPay(), 0.01);
		assertEquals(170, emp2.weeklyPay(), 0.01);
		
	}
}

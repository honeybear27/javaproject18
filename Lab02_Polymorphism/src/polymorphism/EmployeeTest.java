package polymorphism;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetName() {
		Employee emp1 = new Employee("Ronald", 3);
		Employee emp2 = new Employee("Mike", 4);
		
		assertEquals("Ronald", emp1.getName());		
		assertEquals("Mike", emp2.getName());		
	}
	
	@Test
	public void testGetHourlyRate() {
		Employee emp1 = new Employee("Ronald", 3);
		Employee emp2 = new Employee("Mike", 4);
		
		assertEquals(3, emp1.getHourlyRate(), 0.01);		
		assertEquals(4, emp2.getHourlyRate(), 0.01);		
	}
	
	@Test
	public void testWeeklyPay() {
		Employee emp1 = new Employee("Ronald", 3);
		Employee emp2 = new Employee("Mike", 4);
		
		assertEquals(3, emp1.weeklyPay(), 0.01);		
		assertEquals(4, emp2.weeklyPay(), 0.01);		
	}
	
	@Test
	public void testEquals() {
		Employee emp1 = new Employee("Ronald", 3);
		Employee emp2 = new Employee("Mike", 4);
		Employee emp3 = new Employee("Ronald", 1);

		assertEquals(false, emp1.equals(emp2));		
		assertEquals(true, emp1.equals(emp3));
		
	}
}

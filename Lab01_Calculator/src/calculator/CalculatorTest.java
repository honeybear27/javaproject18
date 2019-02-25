package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetFirstInput() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		
		assertEquals(2, cal1.getFirstInput(), 0.01);
		assertEquals(10, cal2.getFirstInput(), 0.01);
		
	}
	
	@Test
	public void testGetSecondInput() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		
		assertEquals(3, cal1.getSecondInput(), 0.01);
		assertEquals(4, cal2.getSecondInput(), 0.01);
	}
	
	@Test
	public void testMultiply() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		
		assertEquals(6, cal1.multiply(), 0.01);
		assertEquals(40, cal2.multiply(), 0.01);
	}
	
	@Test
	public void testDivide() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		Calculator cal3 = new Calculator(5, 0);
		
		assertEquals(0.66, cal1.divide(), 0.01);
		assertEquals(2.51, cal2.divide(), 0.01);
		assertEquals(Double.NaN, cal3.divide(), 0.01);
		
	}
	
	@Test
	public void testAdd() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		
		assertEquals(5, cal1.add(), 0.01);
		assertEquals(14, cal2.add(), 0.01);
	}
	
	@Test
	public void testSubtract() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		
		assertEquals(-1, cal1.subtract(), 0.01);
		assertEquals(6, cal2.subtract(), 0.01);
	}
	
	@Test
	public void testPower() {
		Calculator cal1 = new Calculator(2, 3);
		Calculator cal2 = new Calculator(10, 4);
		Calculator cal3 = new Calculator(0, 3);
		Calculator cal4 = new Calculator(3, 0);
		Calculator cal5 = new Calculator(-1, 3);
		Calculator cal6 = new Calculator(2, -2);
		
		assertEquals(8, cal1.power(), 0.01);
		assertEquals(10000, cal2.power(), 0.01);
		assertEquals(0, cal3.power(), 0.01);
		assertEquals(1, cal4.power(), 0.01);
		assertEquals(-1, cal5.power(), 0.01);
		assertEquals(0.25, cal6.power(), 0.01);
		
	}
}

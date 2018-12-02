package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirObjectListTest {

	@Before
	public void setUp() throws Exception {
		// do nothing
	}

	@Test
	public void testEmptyList() {
		AirObjectList list = new AirObjectList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		assertEquals("Print AirObjectList : \n", list.toString());
	}

	@Test
	public void testInsertFront() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);
		
		assertEquals("flyer1", list.insertFront(flyer).getValue().getName()); 
		assertEquals("boeing777", list.insertFront(boeing).getValue().getName());
		assertEquals("Apollo", list.insertFront(spaceship).getValue().getName());
		
	}
	
	@Test
	public void testInsertBack() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);
		
		assertEquals("flyer1", list.insertBack(flyer).getValue().getName()); 
		assertEquals("boeing777", list.insertBack(boeing).getValue().getName());
		assertEquals("Apollo", list.insertBack(spaceship).getValue().getName());
	}
	
	@Test
	public void testInsert() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);
		
		assertEquals("flyer1", list.insert(flyer, 0).getValue().getName()); 
		assertEquals("boeing777", list.insert(boeing, 0).getValue().getName());
		assertEquals("Apollo", list.insert(spaceship, 1).getValue().getName());
	}
	
	@Test
	public void testToString() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);
		
		list.insert(flyer, 0);
		list.insert(boeing, 1);
		list.insert(spaceship, 2);
		assertEquals("Print AirObjectList : \n" + 
				"1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n" + 
				"2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n" + 
				"3: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

	}
}

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
	public void testDelete() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insert(flyer, 0);
		list.insert(boeing, 1);
		list.insert(spaceship, 2);

		list.delete(null);
		assertEquals("Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
				+ "2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n"
				+ "3: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

		list.delete(boeing);
		assertEquals("Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
				+ "2: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

		list.insert(boeing, 1);
		list.delete(flyer);
		assertEquals("Print AirObjectList : \n"
				+ "1: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n"
				+ "2: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

		list.insert(flyer, 0);
		list.delete(spaceship);
		assertEquals(
				"Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
						+ "2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n",
				list.toString());

		list.delete(spaceship);
		assertEquals(
				"Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
						+ "2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n",
				list.toString());

	}

	@Test
	public void testDeleteAndCheck() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);

		// try to delete null
		assertEquals(false, list.deleteAndCheck(null));

		// delete one exist, return true
		assertEquals(true, list.deleteAndCheck(flyer));
		assertEquals(false, list.deleteAndCheck(flyer));

		// delete another, return true
		assertEquals(true, list.deleteAndCheck(boeing));
		assertEquals(false, list.deleteAndCheck(boeing));

		// delete last one left, return true
		assertEquals(true, list.deleteAndCheck(spaceship));
		assertEquals(false, list.deleteAndCheck(spaceship));

	}

	@Test
	public void testDeleteAt() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);

		// try to delete one at position 1, return node before deleted one
		assertEquals("[Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]]",
				list.deleteAt(1).toString());

		// try to delete one at position 1 again, return node before deleted one
		assertEquals("[Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]]", list.deleteAt(1).toString());

		// delete last one left, return null
		assertEquals("[Drone : [flyer1] [Samsung] [2015] [30] [4] [100]]", list.deleteAt(0).toString());

	}

	@Test
	public void testDeleteAndCheckAt() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);

		// delete one and check
		assertEquals(true, list.deletedAndCheckAt(1));
		// delete one and check
		assertEquals(true, list.deletedAndCheckAt(1));
		assertEquals(true, list.deletedAndCheckAt(0));
		assertEquals(false, list.deletedAndCheckAt(0));

	}

	@Test
	public void testDeleteFront() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);

		// delete front
		assertEquals("[Drone : [flyer1] [Samsung] [2015] [30] [4] [100]]", list.deleteFront().toString());

		// delete front
		assertEquals("[Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]]",
				list.deleteFront().toString());

		// delete front
		assertEquals("[Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]]", list.deleteFront().toString());

		// delete front from nothing, return null
		assertEquals(null, list.deleteFront());

	}

	@Test
	public void testDeleteBack() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);
		
		// delete back
		assertEquals("[Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]]", list.deleteBack().toString());

		// delete back
		assertEquals("[Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]]",
				list.deleteBack().toString());

		// delete back
		assertEquals("[Drone : [flyer1] [Samsung] [2015] [30] [4] [100]]", list.deleteBack().toString());

		// delete back from nothing, return null
		assertEquals(null, list.deleteBack());

	}

	@Test
	public void testMoveToFront() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);

		// put rocket to front
		assertEquals("[Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]]", list.moveToFront(spaceship).toString());
		
		// put airplane to front
		assertEquals("[Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]]", list.moveToFront(boeing).toString());
		
		// put airplane to front again
		assertEquals("[Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]]", list.moveToFront(boeing).toString());
		
		// put position 2 to front
		assertEquals("[Drone : [flyer1] [Samsung] [2015] [30] [4] [100]]", list.moveToFront(2).toString());
		
	}

	@Test
	public void testSearch() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insertFront(spaceship);
		list.insertFront(boeing);
		list.insertFront(flyer);
		
		// try to search airplane
		assertEquals(true, list.search(boeing));
		
		list.delete(boeing);
		assertEquals(false, list.search(boeing));
	}

	@Test
	public void testClear() {
		AirObjectList list = new AirObjectList();
		Drone flyer = new Drone("flyer1", "Samsung", 2015, 30, 4, 100);
		Airplane boeing = new Airplane("boeing777", "United States", 2001, 10000, "India", 70, "Patrick");
		Rocket spaceship = new Rocket("Apollo", "United States", 1950, 30000, "Moon", 3);

		list.insert(flyer, 0);
		list.insert(boeing, 1);
		list.insert(spaceship, 2);

		assertEquals("Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
				+ "2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n"
				+ "3: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

		list.clear();
		assertEquals("Print AirObjectList : \n", list.toString());

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
		assertEquals("Print AirObjectList : \n" + "1: Drone : [flyer1] [Samsung] [2015] [30] [4] [100]\n"
				+ "2: Airplane : [boeing777] [United States] [2001] [10000] [India] [70] [Patrick]\n"
				+ "3: Rocket : [Apollo] [United States] [1950] [30000] [Moon] [3]\n", list.toString());

	}
}

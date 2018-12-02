package lrurunway;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirObjectNodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AirObjectNode head = new AirObjectNode(null, null, null);
		AirObjectNode node1 = new AirObjectNode(head, null, new AI_Bird("bird1", "Google", 2000, 9000, "eagle", "war"));
		AirObjectNode node2 = new AirObjectNode(node1, null, new Airplane("airplane1", "microsoft", 2010, 12000, "South Korea", 80, "Ronald"));
		AirObjectNode node3 = new AirObjectNode(node2, null, new Ad_Balloon("ad_balloon1", "Facebook", 2018, 5000, "instagram", 50, 10));
		AirObjectNode tail = new AirObjectNode(node3, null, null);
		
		
		assertEquals("[null]", node1.getPrev().toString());
		tail.setPrev(node3);
		assertEquals("[Ad_Balloon : [ad_balloon1] [Facebook] [2018] [5000] [instagram] [50] [10]]", tail.getPrev().toString());
		
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(tail);
		assertEquals("[Airplane : [airplane1] [microsoft] [2010] [12000] [South Korea] [80] [Ronald]]", node1.getNext().toString());
		assertEquals("[AI_Bird : [bird1] [Google] [2000] [9000] [eagle] [war]]", head.getNext().toString());
		
		assertEquals(null, head.getValue());
		node3.getValue().setName("ad_balloon3");
		assertEquals("Ad_Balloon : [ad_balloon3] [Facebook] [2018] [5000] [instagram] [50] [10]", node3.getValue().toString());

		node3.setValue(new Ad_Balloon("ad_balloon2", "Facebook", 2018, 5000, "instagram", 50, 10));
		assertEquals("Ad_Balloon : [ad_balloon2] [Facebook] [2018] [5000] [instagram] [50] [10]", node3.getValue().toString());
		
		assertEquals("[Ad_Balloon : [ad_balloon2] [Facebook] [2018] [5000] [instagram] [50] [10]]", node3.toString());
	}

}

package lrurunway;

public class AirObjectList {

	private AirObjectNode head;
	private AirObjectNode tail;
	private int size;

	public AirObjectList() {
		head = new AirObjectNode(null, null, null);
		tail = new AirObjectNode(head, null, null);
		head.setNext(tail);
		size = 0;
	}

	public AirObjectNode insertFront(AirObject newAirObject) {
		if (newAirObject == null) {
			return null;
		}
		AirObjectNode newNode = new AirObjectNode(head, head.getNext(), newAirObject);
		head.getNext().setPrev(newNode);
		head.setNext(newNode);
		size++;
		return newNode;
	}

	public AirObjectNode insertBack(AirObject newAirObject) {
		if (newAirObject == null) {
			return null;
		}
		AirObjectNode newNode = new AirObjectNode(tail.getPrev(), tail, newAirObject);
		tail.getPrev().setNext(newNode);
		tail.setPrev(newNode);
		size++;
		return newNode;
	}

	public AirObjectNode insert(AirObject newAirObject, int position) {
		if (newAirObject == null || position > size) {
			return null;
		}

		AirObjectNode newNode = new AirObjectNode(null, null, newAirObject);

		AirObjectNode curr = head;
		int count = 0;

		for (int i = 0; i < position; i++) {
			curr = curr.getNext();
		}

		newNode.setPrev(curr);
		curr.getNext().setPrev(newNode);
		newNode.setNext(curr.getNext());
		curr.setNext(newNode);
		size++;
		
		return newNode;
	}
	
	public String toString() {
		AirObjectNode curr = head.getNext();
		StringBuilder sb = new StringBuilder("Print AirObjectList : \n");
		
		while(curr != tail) {
			sb.append(curr.getValue().toString() + "\n");
			curr = curr.getNext();
		}
		
		return sb.toString();
	}
}

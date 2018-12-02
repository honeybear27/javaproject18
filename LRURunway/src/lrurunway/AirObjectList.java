package lrurunway;

/**
 * The Class AirObjectList.
 */
public class AirObjectList {

	/** The head. */
	private AirObjectNode head;
	
	/** The tail. */
	private AirObjectNode tail;
	
	/** The size. */
	private int size;

	/**
	 * Instantiates a new air object list.
	 */
	public AirObjectList() {
		head = new AirObjectNode(null, null, null);
		tail = new AirObjectNode(head, null, null);
		head.setNext(tail);
		size = 0;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return head.getNext() == tail;
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return size;
	}

	/**
	 * Insert new Node into the list forward.
	 *
	 * @param newAirObject the new air object
	 * @return the air object node
	 */
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

	/**
	 * Insert new Node into the list backward.
	 *
	 * @param newAirObject the new air object
	 * @return the air object node
	 */
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

	/**
	 * Insert new Node into the list where I want to put in.
	 *
	 * @param newAirObject the new air object
	 * @param position the position
	 * @return the air object node
	 */
	public AirObjectNode insert(AirObject newAirObject, int position) {
		if (newAirObject == null || position > size) {
			return null;
		}

		AirObjectNode newNode = new AirObjectNode(null, null, newAirObject);

		AirObjectNode curr = head;

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

	/**
	 * print out all linked list including node inserted
	 */
	public String toString() {
		AirObjectNode curr = head.getNext();
		StringBuilder sb = new StringBuilder("Print AirObjectList : \n");
		
		int count = 1;
		
		while (curr != tail) {
			sb.append(count + ": " + curr.getValue().toString() + "\n");
			curr = curr.getNext();
			count++;
		}

		return sb.toString();
	}
}

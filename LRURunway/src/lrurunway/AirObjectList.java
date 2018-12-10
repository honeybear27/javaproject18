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
	
	public AirObjectNode delete(AirObject todelete) {
		if (todelete == null) {
			return null;
		}
		
		AirObjectNode curr = head;
		AirObjectNode delete = new AirObjectNode(null, null, todelete);
		
		for (int i = 0; i < size; i++) {
			if (curr.getNext().getValue().equals(delete.getValue())) {
				break;
			}
			curr = curr.getNext();
		}
		
		if (curr.getNext() == tail) {
			return null;
		} else {
			curr.getNext().getNext().setPrev(curr);
			curr.setNext(curr.getNext().getNext());
			size--;			
		}
		
		return curr;
	}
	
	public boolean isDeleted(AirObject todelete) {
		if (todelete == null) {
			return false;
		}
		
		AirObjectNode curr = head;
		AirObjectNode delete = new AirObjectNode(null, null, todelete);
		
		for (int i = 0; i < size; i++) {
			if (curr.getNext().getValue().equals(delete.getValue())) {
				break;
			}
			curr = curr.getNext();
		}
		
		if (curr.getNext() == tail) {
			return false;
		} else {
			curr.getNext().getNext().setPrev(curr);
			curr.setNext(curr.getNext().getNext());
			size--;
			return true;
		}
	}
	
	public AirObjectNode deleteAt(int position) {
		if (position > size) {
			return null;
		}
		
		AirObjectNode curr = head;

		for (int i = 0; i < position; i++) {
			curr = curr.getNext();
		}
		
		curr.getNext().getNext().setPrev(curr);
		curr.setNext(curr.getNext().getNext());
		size--;
		
		return curr;
	}
	
	public boolean isDeletedAt(int position) {
		if (position > size) {
			return false;
		}
		
		AirObjectNode curr = head;
		
		for (int i = 0; i < position; i++) {
			curr = curr.getNext();
		}
		
		curr.getNext().getNext().setPrev(curr);
		curr.setNext(curr.getNext().getNext());
		size--;
		
		return true;
	}
	
	public AirObjectNode deleteFront() {
		if (head.getNext() == tail) {
			return null;
		}
		
		head.getNext().getNext().setPrev(head);
		head.setNext(head.getNext().getNext());
		size--;
		
		return head;
	}
	
	public AirObjectNode deleteBack() {
		if (tail.getPrev() == head) {
			return null;
		}
		
		tail.getPrev().getPrev().setNext(tail);
		tail.setPrev(tail.getPrev().getPrev());
		size--;
		
		return head;
	}
	
	public AirObjectNode moveToFront(AirObject newAirObject) {
		
		if (newAirObject == null) {
			return null;
		}
		
		AirObjectNode curr = head;
		AirObjectNode newNode = new AirObjectNode(null, null, newAirObject);
		
		for (int i = 0; i < size; i++) {
			if (curr.getNext().getValue().equals(newNode.getValue())) {
				break;
			}
			curr = curr.getNext();
		}
		
		AirObjectNode temp = curr.getNext();
		
		curr.getNext().getNext().setPrev(curr);
		curr.setNext(curr.getNext().getNext());
		
		temp.setNext(head.getNext());
		temp.setPrev(head);
		head.getNext().setPrev(temp);
		head.setNext(temp);
		
		return temp;
	}
	
	public void clear() {
		if (head.getNext() != tail) {
			head.setNext(tail);
			tail.setPrev(head);
		}
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

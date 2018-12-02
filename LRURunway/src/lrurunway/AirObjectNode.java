package lrurunway;

// TODO: Auto-generated Javadoc
/**
 * The Class AirObjectNode.
 */
public class AirObjectNode {
	
	/** The prev. */
	private AirObjectNode prev;
	
	/** The next. */
	private AirObjectNode next;
	
	/** The value. */
	private AirObject value;

	/**
	 * Instantiates a new air object node.
	 *
	 * @param prev the prev
	 * @param next the next
	 * @param value the value
	 */
	public AirObjectNode(AirObjectNode prev, AirObjectNode next, AirObject value) {
		this.prev = prev;
		this.next = next;
		this.value = value;
	}

	/**
	 * Gets the prev.
	 *
	 * @return the prev
	 */
	public AirObjectNode getPrev() {
		return prev;
	}

	/**
	 * Sets the prev.
	 *
	 * @param newPrev the new prev
	 */
	public void setPrev(AirObjectNode newPrev) {
		prev = newPrev;
	}

	/**
	 * Gets the next.
	 *
	 * @return the next
	 */
	public AirObjectNode getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 *
	 * @param newNext the new next
	 */
	public void setNext(AirObjectNode newNext) {
		next = newNext;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public AirObject getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param newValue the new value
	 */
	public void setValue(AirObject newValue) {
		value = newValue;
	}

	/**
	 * print out the value of AirObject
	 */
	public String toString() {
		return "[" + value + "]";
	}

}
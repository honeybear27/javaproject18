package lrurunway;

public class AirObjectNode {
	private AirObjectNode prev;
	private AirObjectNode next;
	private AirObject value;

	public AirObjectNode(AirObjectNode prev, AirObjectNode next, AirObject value) {
		this.prev = prev;
		this.next = next;
		this.value = value;
	}

	public AirObjectNode getPrev() {
		return prev;
	}

	public void setPrev(AirObjectNode newPrev) {
		prev = newPrev;
	}

	public AirObjectNode getNext() {
		return next;
	}

	public void setNext(AirObjectNode newNext) {
		next = newNext;
	}

	public AirObject getValue() {
		return value;
	}

	public void setValue(AirObject newValue) {
		value = newValue;
	}

	public String toString() {
		return "[" + value + "]";
	}

}
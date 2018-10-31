package co.grandcircus.lists;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;
	@Override
	public void removeAt(int index) {
		Node newNode = getNodeAt(index -1);
		Node node = getNodeAt(index + 1);
		newNode.setNext(node);
		length--;
	}
	@Override
	public void insertAt(int index, String data) {
		
		Node newNode = new Node(data);
		if (length == 0) {
			newNode.setNext(head);
			head = newNode;
			length++;
			return;
		}
		Node neighborOne = getNodeAt(index -1);
		Node neighborTwo = getNodeAt(index);
		neighborOne.setNext(newNode);
		newNode.setNext(neighborTwo);
		length++;
	}
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		length++;
	}
	
	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}
	
	@Override
	public void addAtEnd(String data) {
		Node newNode = new Node(data);
		Node oldTail = getNodeAt(length-1);
		oldTail.setNext(newNode);
		length++;
	}
	
	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	}
	
	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end 
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}
	
	@Override
	public int size() {
		return length;
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

}

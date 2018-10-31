package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		testArrayList();
		testLinkedList();
		
		
	
	}
	private static void testArrayList() {
		MyList list = new MyArrayList();
		
		
		list.addAtBeginning("D");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.insertAt(2, "C");
//		list.removeFromBeginning();
//		list.removeFromEnd();
//		
		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
	}
	
	private static void testLinkedList() {
		MyList list = new MyLinkedList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.removeFromBeginning();
		list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}

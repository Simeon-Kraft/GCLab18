package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		testArrayList();
		//testLinkedList();
		
		
	
	}
	private static void testArrayList() {
		MyList list = new MyArrayList();
		
		
		list.insertAt(0, "B");
		list.addAtBeginning("A");
		list.insertAt(2, "C");
		list.insertAt(3, "D");
		list.removeAt(2);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
	
	private static void testLinkedList() {
		MyList list = new MyLinkedList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("F");
		list.insertAt(3, "C");
		list.removeAt(2);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(2));
	}

}

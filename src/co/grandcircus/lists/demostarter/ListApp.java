package co.grandcircus.lists.demostarter;


public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		
		list.addAtEnd("A");
		list.addAtEnd("B");
		list.addAtEnd("C");
		list.removeFromBeginning();
		
		System.out.println(list);
		System.out.println(list.size());
	}

}

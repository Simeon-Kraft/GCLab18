package co.grandcircus.lists.demostarter;

import java.util.Arrays;

public class MyArrayList implements MyList {

	// The allocated array of memory. This might be bigger than the actual list.
	private String[] array = new String[4];
	// How many items are actually in the list. May be less than the length of the
	// array.
	private int length = 0;

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			doubleLength();
		}

		array[length] = data; // adds to the index before length++, so its added to index length -1
		length++;
	}

	@Override
	public void removeFromEnd() {
		if (length != 0) {
			length--;
			array[length] = null; // reduce length first, then set that last index to null
		}
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}
		for (int i = length - 1; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		if (length != 0) {
			for (int i = 0; i < length; i++) {
				array[i] = array[i + 1];
			}
			length--;
		}
	}

	@Override
	public String get(int index) {
		if (index < 0 || index >= length) {
			throw new IndexOutOfBoundsException();
		} else {
			return array[index];
		}
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");

		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}

		sb.append(" ]");
		return sb.toString();
	}

	private boolean isFull() {
		return length == array.length;
	}

	private void doubleLength() {
		array = Arrays.copyOf(array, array.length * 2);
	}

}

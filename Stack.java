/*
 * Name: Adam Kaplan
 * 
 * NetID: akaplan6
 * 
 * Project: #2
 * 
 * Lab Section: TR 4:50PM - 6:05PM (I switched my lab section)
 * 
 * TA: Vishnu Chittaci
 * 
 * I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own.
 */

public class Stack<T> implements StackInterface<T> {
	
	// SimplyLinkedList used in this implementation of a Stack
	private LinkedList<T> list;
	
	// Constructor: Initializes the LinkedList
	public Stack(){
		list = new LinkedList<T>();
	}

	@Override
	// Returns a boolean if the Stack is empty or not
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	// Inserts data on top of the stack
	public void push(T data) {
		list.insertFirst(data);
	}

	@Override
	// Deletes the item at the top and returns it
	public T pop() {
		if(isEmpty())
			return null;
		else
			return list.deleteFirst();
	}

	@Override
	// Returns the item at the top and does not delete it
	public T peek() {
		if(isEmpty())
			return null;
		else
			return list.lookupFirst();
	}
	
}

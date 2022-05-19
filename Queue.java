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

public class Queue<T> implements QueueInterface<T> {
	private DoubleLinkedList<T> list;
	
	// Constructor
	public Queue(){
		list = new DoubleLinkedList<T>();
	}
	
	@Override
	// Method to check if the queue is empty or not
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	// Method to insert an element to the end of the queue
	public void enqueue(T data) {
		list.insertLast(data);
	}

	@Override
	// Method to delete the element at the beginning of the queue and returning it
	public T deque() {
		if(isEmpty())
			return null;
		else
			return list.deleteFirst();
	}

	@Override
	// Method to return the element at the beginning of the queue
	public T peek() {
		if(isEmpty())
			return null;
		else
			return list.lookupFirst();
	}

}

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

public class DoubleLinkedList<T> implements DoublyLinkedList<T>{
	private DoubleNode<T> first;
	private DoubleNode<T> last;
	
	// Constructor
	public DoubleLinkedList(){
		first = new DoubleNode<T>(null, last, null);
		last = new DoubleNode<T>(null, null, first);
	}

	@Override
	// This methods appends data to the list
	// Runtime: O(n)
	public void insert(T data) {
		DoubleNode<T> node = new DoubleNode<T>(data, last, last.previous);
		
		if(!this.contains(data)){
			last.previous.next = node;
			last.previous = node;
		}
	}
	
	// NEW METHOD
	// Special method for the Queue to insert the new element at the end of the list.
	// Runtime: O(1)
	public void insertLast(T data){
		DoubleNode<T> node = new DoubleNode<T>(data, last, last.previous);
		last.previous.next = node;
		last.previous = node;
	}
	
	// NEW METHOD
	// Special method for the Queue to always delete the first term in the list.
	// Runtime: O(1)
	public T deleteFirst(){
		DoubleNode<T> node = first.next;
		
		first.next.next.previous = first;
		first.next = first.next.next;
		
		return node.data;
	}
	
	// NEW METHOD
	// Special method for the Queue to always return the first item in the list.
	// Runtime: O(1)
	public T lookupFirst(){
		return first.next.data;
	}

	@Override
	// This method deletes an element from the list
	public void delete(T data) {
		DoubleNode<T> current = first;
		
			while(current != last){
				if(current.data == data){
					current.previous.next = current.next;
					
					if(current.next != null){
						current.next.previous = current.previous;
					}
				}
				current = current.next;
			}
	}

	@Override
	// This method tells you if an element is in the list
	public boolean contains(T data) {
		DoubleNode<T> current = first;
		
		while(current != null){
			if(current.data == data)
				return true;
			current = current.next;
		}
		return false;
	}

	@Override
	// This method looks up an element in the list and returns it
	public T lookup(T data) {
		DoubleNode<T> current = first;
		
		while(current != last){
			if(current.data == data)
				return current.data;
			current = current.next;
		}
		return null;
	}

	@Override
	// This method tells you if the list is empty
	public boolean isEmpty() {
		return last.previous == first;
	}

	@Override
	// This method prints the list in the right order
	// Runtime: O(n)
	public void printList() {
		DoubleNode<T> current = first.next;
		
		while(current != last){
			System.out.print(current.data.toString());
			current = current.next;
		}
	}

	@Override
	// This method prints the list in reverse order
	// Runtime: O(n)
	public void printListRev() {
		DoubleNode<T> current = last.previous;
		
		while(current != first){
			System.out.print(current.data.toString());
			current = current.previous;
		}
	}
}

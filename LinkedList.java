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

public class LinkedList<T> implements SimpleLinkedList<T>{
	private Node<T> first;
	
	// Constructor
	public LinkedList(){
		first = null;
	}
	
	// NEW METHOD
	// Special method for Stack, which inserts an item at the top(beginning) of the list.
	// Doesn't care about duplicates to minimize runtime
	// Runtime: O(1)
	public void insertFirst(T data){
		Node<T> node = new Node<T>(data, first);
		
		first = node;
	}
	
	// NEW METHOD
	// Special method for Stack, which deletes the item at the top(beginning) of the list.
	// Runtime: O(1)
	public T deleteFirst(){
		Node<T> node = first;
		
		first = first.next;
		
		return node.data;
	}
	
	// NEW METHOD
	// Special method for Stack, which returns the item at the top(beginning) of the list.
	// Runtime: O(1)
	public T lookupFirst(){
		return first.data;
	}

	@Override
	// This method prepends new data to the list
	// Runtime: O(n) because of contains
	public void insert(T data) {
		Node<T> node = new Node<T>(data, first);
		
		if(!this.contains(data))
			first = node;
	}

	@Override
	// This method deletes an element from the list
	// Works for both prepend and append
	public void delete(T data) {

		Node<T> current = first;
		
		// Checks if it is the first node
		if(first.data == data){
			first = first.next;
		}
		// otherwise it runs through all of the nodes
		else{
			while(current.next != null){
				if(current.next.data == data){
					current.next = current.next.next;
					break;
				}
				current = current.next;
			}
		}
	}

	@Override
	// This method checks if an element is in the list
	public boolean contains(T data) {

		Node<T> current = first;
		
		while(current != null){
			if(current.data == data)
				return true;
			current = current.next;
		}
		return false;
	}

	@Override
	// This method returns an element from the list if it is in the list, otherwise null
	public T lookup(T data) {
		Node<T> current = first;
		
		while(current != null){
			if(current.data == data)
				return data;
			current = current.next;
		}
		return null;
	}

	@Override
	// This method checks if the list is empty or not
	public boolean isEmpty() {
		if(first == null)
			return true;
		return false;
	}

	@Override
	// Runtime: O(n)
	public void printList() {
		Node<T> current = first;
		// TODO Auto-generated method stub
		while(current != null){
			System.out.print(current.data.toString());
			current = current.next;
		}
	}
	
}

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

public interface SimpleLinkedList<T> {
	public void insert(T data);
	public void delete(T data);
	public boolean contains(T data);
	public T lookup(T data);
	public boolean isEmpty();
	public void printList();
}

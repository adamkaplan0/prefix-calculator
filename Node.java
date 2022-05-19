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


public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}
}
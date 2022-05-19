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

public class DoubleNode<T> {
	public T data;
	public DoubleNode<T> next;
	public DoubleNode<T> previous;
	
	public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> previous){
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
}

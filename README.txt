=== CSC 172 Project 02 ===
Author: Adam Kaplan (akaplan6)
Submitted on: February 26, 2016
Lab Section: TR 4:50PM - 6:05PM (I switched my lab section)
TA: Vishnu Chittaci

I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own.


== General Description ==

This project is a Prefix Calculator. Despite the name, this calculator reads in any text file containing infix formulas and evaluates them. My program includes these supported operators: +,-,*,/,%,^,<,>,=,&,|,!. For my program the spacing of the equations does not matter. In addition, floating point numbers are also allowed.
You can run the program by first compiling it and then running the following command:
./Main input.txt result.txt

This will read in the equations in input.txt and output the results in result.txt.

== Additional Information ==

Supported Operators: +,-,*,/,%,^,<,>,=,&,|,!
Supported type of numbers: Integer, Double
Spacing does not matter

== Extra Credit ==

Program supports: ^, %
Spacing does not matter through usage of Regex.
Error handling for wrong input.

== Input File Information ==

The input file is the same as Prof. Pawlicki uploaded, but I added two more expressions to show that % and ^ works.
1^3+56=79 … The result should be 0.00 since it is not equal
2%5*(2^3+(8-9)) … The result should be 14.00 since 2%5 = 2 and 2^3 - 1= 7 and 7*2=14

== Files ==

Calculator.java	 - Class which translates and evaluates infix expressions
DoubleLinkedList.java - Class implementing a DoublyLinkedList
DoubleNode.java - Class representing the Node for a DoublyLinkedList
DoublyLinkedList.java - Interface of a DoublyLinkedList
LinkedList.java - Class implementing a SimpleLinkedList
Node.java - Class representing the Node for a LinkedList
SimpleLinkedList.java - Interface of a SimpleLinkedList
Queue.java - Class implementing the queue interface
QueueInterface.java - Queue Interface
Stack.java - Class implementing the stack interface
StackInterface.java - Stack Interface
Main.java	- 	I/O part of the program. Reads in file and outputs results in another
OUTPUT.txt	-	Copy & Paste of console output
infix_expr_short.txt - Input text file for the program
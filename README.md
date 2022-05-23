# Prefix Calculator

## General Information

Despite the name, this calculator reads in any text file containing infix formulas and evaluates them. My program includes these supported operators: +,-,*,/,%,^,<,>,=,&,|,!. For my program the spacing of the equations does not matter. In addition, floating point numbers are also allowed.

## How To Get Going

You can run the program by first compiling it and then running the following command:

```shell
./Main input.txt result.txt
```

This will read in the equations in `input.txt` and output the results in `result.txt`.

## Implementation Details

* Supported Operators: +,-,*,/,%,^,<,>,=,&,|,!
* Supported type of numbers: Integer, Double
* Spacing does not matter
* Error handling for wrong input.

## File Information

* `Calculator.java` -- Class which translates and evaluates infix expressions.
* `DoubleLinkedList.java` -- Class implementing a `DoublyLinkedList`.
* `DoubleNode.java` -- Class representing the Node for a `DoublyLinkedList`.
* `DoublyLinkedList.java` -- Interface of a `DoublyLinkedList`.
* `LinkedList.java` -- Class implementing a `SimpleLinkedList`.
* `Node.java` -- Class representing the Node for a `LinkedList`.
* `SimpleLinkedList.java` -- Interface of a `SimpleLinkedList`.
* `Queue.java` -- Class implementing the Queue interface.
* `QueueInterface.java` -- Queue Interface.
* `Stack.java` -- Class implementing the Stack interface.
* `StackInterface.java` - Stack Interface.
* `Main.java` -- I/O part of the program. Reads in file and outputs results in another.
* `OUTPUT.txt` -- Copy & Paste of console output.
* `infix_expr_short.txt` -- Input text file for the program.

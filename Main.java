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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		Scanner sc;
		PrintWriter pw;
		File inf = new File(args[0]), ouf = new File(args[1]);
		
		try {
			sc = new Scanner(inf);
			pw = new PrintWriter(ouf);
			while(sc.hasNextLine()){
				pw.println(c.calculate(sc.nextLine()));
			}
			pw.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file you requested was not found.");
		}
	}

}

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

public class Calculator{

	private Stack<String> stack;
	private Queue<String> queue;
	private final String decPattern = "^\\d*\\.?\\d*$"; // Regex pattern for decimal numbers
	private final String spacingPattern = "\\s*\\+|\\-|\\*|\\/|\\^|\\%|\\||\\&|\\=|\\<|\\>|\\(|\\)|\\!\\s*([^)]*?)\\s*";

	public Calculator(){
		stack = new Stack<String>();
		queue = new Queue<String>();
	}

	private void translate(String infix){
		// I modified this regex for my purposes: http://stackoverflow.com/questions/35137571/regex-to-remove-spaces-around-parenthesis-in-java
		
		// Space out all of the important operators
		infix = infix.replaceAll(spacingPattern, " $0 ");
		
		String[] infixArray = infix.split(" "); // Split operators apart
		System.out.println("Calculations:");
		for(String s : infixArray){
			
			if(s.matches(decPattern) && !s.equals("")){
				queue.enqueue(s);
			}
			else if(s.equals("(")){
				stack.push(s);
			}
			else if(s.equals(")")){
				while(!stack.isEmpty() && !stack.peek().equals("(")){
					queue.enqueue(stack.pop());
				}
				stack.pop();
			}
			else if(s.equals("+") || s.equals("-")){
				while(!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("=") && !stack.peek().equals("<") && !stack.peek().equals(">")){
					queue.enqueue(stack.pop());
				}
				stack.push(s);
			}
			else if(s.equals("*") || s.equals("/") || s.equals("%")){
				while(!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("=") && !stack.peek().equals("<") && !stack.peek().equals(">") && !stack.peek().equals("+") && !stack.peek().equals("-")){
					queue.enqueue(stack.pop());
				}
				stack.push(s);
			}
			else if(s.equals("^")){
				while(!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("=") && !stack.peek().equals("<") && !stack.peek().equals(">") && !stack.peek().equals("*") && !stack.peek().equals("/") && !stack.peek().equals("%") && !stack.peek().equals("+") && !stack.peek().equals("-")){
					queue.enqueue(stack.pop());
				}
				stack.push(s);
			}
			else if(s.equals("<") || s.equals(">") || s.equals("=")){
				while(!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("=") && !stack.peek().equals("<") && !stack.peek().equals(">")){
					queue.enqueue(stack.pop());
				}
				stack.push(s);
			}
			else if(s.equals("&") || s.equals("|")){
				while(!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("=") && !stack.peek().equals("<") && !stack.peek().equals(">") && !stack.peek().equals("&") && !stack.peek().equals("|")){
					queue.enqueue(stack.pop());
				}
				stack.push(s);
			}
			else if(s.equals("!")){
				stack.push(s);
			}
		}
		
		while(!stack.isEmpty())
			queue.enqueue(stack.pop());
	}
	
	// Method to calculate the result
	public String calculate(String infix){
		boolean error = false;
		translate(infix);
		
		while(!queue.isEmpty()){

			double d1 = 0.0, d2 = 0.0;
			String token = queue.deque();
			
			if(token.matches(decPattern)){
				stack.push(token);
			}
			else if(token.equals("+")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(d1 + d2);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("-")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(d2 - d1);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("*")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(d1 * d2);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("/")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(d2 / d1);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("^")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(Math.pow(d2, d1));
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("%")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = Double.toString(d2 % d1);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("<")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = d2 < d1 ? Double.toString(1.0) : Double.toString(0.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals(">")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = d2 > d1 ? Double.toString(1.0) : Double.toString(0.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("=")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = d2 == d1 ? Double.toString(1.0) : Double.toString(0.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("&")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = (d2 == 1 && d1 == 1) ? Double.toString(1.0) : Double.toString(0.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("|")){
				try{
					d1 = Double.parseDouble(stack.pop());
					d2 = Double.parseDouble(stack.pop());
					String result = (d2 == 1 || d1 == 1) ? Double.toString(1.0) : Double.toString(0.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
			else if(token.equals("!")){
				try{
					d1 = Double.parseDouble(stack.pop());
					String result = (d1 == 1) ? Double.toString(0.0) : Double.toString(1.0);
					System.out.println(result);
					stack.push(result);
				}
				catch(NullPointerException e){
					error = true;
					System.out.println("There was something wrong with the input.");
				}
				catch(ArithmeticException e){
					error = true;
					System.out.println("The calculation was illegal.");
				}
			}
		}
		
		return error ? "" : String.format("%.2f", Double.parseDouble(stack.pop()));
	}
}
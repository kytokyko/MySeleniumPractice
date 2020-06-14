package java_programs;

public class StringClassDemo {
	
	// String is a predefined class in java
	
	/*
	 * String literal 
	 * creating object of a string
	 */
	
	String a ="hello"; // String literal
	String abc=new String("hello"); // creating object of a string
	
	// while performing String literal the java compiler will create object and assign the value in the background
	// while we create an object and assign the value directly
	
	String b="hello";
	// we already have a variable a assigned with "hello" above.
	// on giving b="hello" java will not create a new memory space , instead it will replace the existing memory and overwrite the value
	
	String def=new String("hello");
	// by the above we are forcefully creating an object and assigning the value so new memory space will be allocated  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

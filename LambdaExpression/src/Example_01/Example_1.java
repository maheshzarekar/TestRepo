/* Write a java program to create lambda expression that display a Hello message. 
 * Call and execute the expression using functional interface reference.*/

package Example_01;

public class Example_1 {
	
	interface MyInter{			//Creating functional interface
		void message();			// with Single Abstract Method
	}

	public static void main(String[] args) {
		
		// Create Functional Interface Reference that refers to lambda expression
		MyInter mi=()->System.out.println("Welcome to the world of Lambda");
		
		//call the method using reference
		mi.message();
		
	}
}

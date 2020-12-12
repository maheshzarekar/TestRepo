/* Write a java program to create lambda expression that calculates 
and returns the square root value of given number */

package Example_03;

public class Example_3 {

	// Create a functional interface with single abstract method
	interface MyInter {
		double squareroot(double num);
	}

	public static void main(String[] args) {
		// create a functional interface reference that refers to lambda expression
		MyInter mi = x -> Math.sqrt(x);

		// call the method using reference
		System.out.println("Square root of 256=" + mi.squareroot(256));
	}

}

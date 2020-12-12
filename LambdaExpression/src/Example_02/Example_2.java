//Write a program to create and execute a lambda expression that adds two integer

package Example_02;

public class Example_2 {
	
	interface MyInterface{			//Create a functional interface with
		void add(int a, int b);		//Single abstract method
	}
	
	public static void main(String[] args) {
		
		//create functional interface reference that refers to lambda expression
		MyInterface mi = (int a,int b)->System.out.println("Sum="+(a+b));
		
		//call the method using reference
		mi.add(10, 22);
	}
}

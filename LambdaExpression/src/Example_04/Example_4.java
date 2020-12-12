/* Write a program to access variables of a class and of a method using lambda expression*/

package Example_04;

public class Example_4 {

	// variable in the class
	int x = 10;

	// method in the class
	void method() {
		// variable in the method
		int x = 20;

		// create reference of functional interface to lambda expression
		Runnable r = () -> {
			System.out.println("var of the class = " + this.x);
			System.out.println("var of the method = " + x);
		};

		// create a thread and run it
		Thread t = new Thread(r);
		t.start();
	}

	public static void main(String[] args) {
		// create object to the class and call the method
		Example_4 obj = new Example_4();
		obj.method();
	}

}

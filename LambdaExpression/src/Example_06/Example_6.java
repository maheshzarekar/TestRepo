// Program to display message using Thread

// Simple Thread Program
package Example_06;

public class Example_6 implements Runnable {

	// implements run() method of the Runnable interface
	@Override
	public void run() {
		System.out.println("This is from thread");
	}

	public static void main(String[] args) {

		// create an object of the class
		Example_6 obj = new Example_6();

		// attach thread to the object
		Thread t = new Thread(obj);

		// run the thread on the object
		t.start();
	}
}

// Simple Thread program - version 2
// In this version, we are separately creating implementation class of Runnable interface

package Example_07;

public class Example_7 {

	public static void main(String[] args) {
		// create thread object and pass the object of implementation class of Runnable interface
		Thread t = new Thread(new Implclass());
		
		// run the thread
		t.start();
	}

}

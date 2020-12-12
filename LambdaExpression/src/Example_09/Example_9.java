// a simple thread program - version 4
// in this version, we are passing lambda expression to the thread class object

package Example_09;

public class Example_9 {

	public static void main(String[] args) {
	
		// Create a Thread object and pass lambda expression
		Thread t= new Thread(
		
			// lambda expression to implement run() method	
			()->System.out.println("This is from lambda expression"));
		
		// run the thread
		t.start();
	}

}

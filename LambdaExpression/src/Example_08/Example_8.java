// Simple Thread program - version 3
// in this version, we are using anonymous inner class

package Example_08;

public class Example_8 {

	public static void main(String[] args) {

		// create thread object and pass the object of anonymous class
		Thread t = new Thread(new Runnable() {
			// implementing the run() method of Runnable interface
			@Override
			public void run() {
				System.out.println("This is from anonymous inner class");
			}
		});

		// run the thread
		t.start();
	}

}

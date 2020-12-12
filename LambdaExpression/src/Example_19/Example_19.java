package Example_19;

public class Example_19 {
	
	static void display() {
		System.out.println("Hello from display");
	}
	
	public static void main(String[] args) {
		
		// lambda expression represents the run() method of Runnable
		Runnable r1=()->System.out.println("Hello from lambda");
		r1.run();
		
		// double colon refers the display() method of Example_19 class
		Runnable r2=Example_19::display;
		r2.run();
	}

}


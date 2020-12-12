// Two interfaces with same default method name

package Example_13;

interface One {
	default void message() {
		System.out.println("Hello from one");
	}
}

interface Two {
	default void message() {
		System.out.println("Hello from two");
	}
}

class ImplClass implements One, Two {
	// override the message() to resolve the confusion
	@Override
	public void message() {
		One.super.message(); 	// this will call One's message() method
	}
}

public class Example_13 {
	public static void main(String[] args) {
		ImplClass obj = new ImplClass();
		obj.message();
	}
}

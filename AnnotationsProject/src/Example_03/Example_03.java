package Example_03;

class MyClass {
	@Deprecated
	void myMethod() {
		System.out.println("This method is deprecated");
	}
}

public class Example_03 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod();
	}
}

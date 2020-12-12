// an interface with a default method

package Example_12;

interface MyInter {
	int add(int x, int y); // this public and abstract

	default int mul(int x, int y)	// this is default method 
	{
		return (x * y);
	}
}

class A implements MyInter {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
}

public class Example_12 {
	public static void main(String[] args) {
		
		// interface reference can refer to object of its implementation classes
		MyInter mi = new A();
		System.out.println("Sum = " + mi.add(10, 15));
		
		// default method is by default available in implementation class
		System.out.println("Product = " + mi.mul(10, 15));
	}
}

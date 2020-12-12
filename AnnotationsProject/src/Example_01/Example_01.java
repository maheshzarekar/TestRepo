package Example_01;
class one{
	void doSomething() {
		System.out.println("Hi");
	}
}
class two extends one{
	@Override
	void doSomething() {
		System.out.println("Hello");
	}
}
public class Example_01 {

	public static void main(String[] args) {
		two t= new two();
		t.doSomething();
	}

}

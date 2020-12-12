// double colon operator to refer constructor
package Example_20;

class Sample {

	// instance variable
	private String x;

	// constructor
	Sample(String x) {
		this.x = x;
		System.out.println("Constructor Executed : " + x);
	}
}

// functional interface with get() method that returns single class object
interface MyInter {
	Sample get(String str);
}

public class Example_20 {

	public static void main(String[] args) {

		// this lambda expression returns Sample class object
		MyInter mi = (String x) -> new Sample(x);
		Sample s = mi.get("from Lambda Expression");

		// double colon operator refers to sample class constructor
		MyInter mil = Sample::new;
		Sample s1 = mil.get("from double colon operator");
	}
}

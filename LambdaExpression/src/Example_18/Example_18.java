// Program to create a Function that returns the length of a string
package Example_18;

import java.util.function.Function;

public class Example_18 {

	public static void main(String[] args) {

		// create a function reference to lambda expression to find length of a string
		Function<String, Integer> len = str -> str.length();

		// find the length of the string str
		String str = "I Love My India";
		System.out.println("Length = " + len.apply(str));
	}
}

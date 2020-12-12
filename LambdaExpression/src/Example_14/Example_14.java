// Write a program using predicate to know whether a given number is greater than 10 or not

package Example_14;

import java.util.function.Predicate;

public class Example_14 {

	public static void main(String[] args) {
		// use Predicate interface to show the lambda expression
		Predicate<Integer> gt = i -> i > 10;

		// call test() method of Predicate that returns true or false
		boolean result = gt.test(15);
		System.out.println("Greater than 10 : " + result);
	}
}

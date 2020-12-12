// Write a java program to understand how to join two predicates

package Example_17;

import java.util.function.Predicate;

public class Example_17 {

	public static void main(String[] args) {

		// take a group of Integer objects in an array
		Integer[] arr = { 8, 9, 10, 11, 12, 13, 14, 15 };

		// create Predicate reference
		Predicate<Integer> gt, lt;

		// lambda expression to return true if the number > 10
		gt = n -> n > 10;

		// lambda expression to return true if the number < 10
		lt = n -> n < 15;

		System.out.println("Numbers > 10 and < 15 : ");
		display(gt.and(lt), arr);

		System.out.println("\nNumbers <= 10 and >= 15 : ");
		display(gt.and(lt).negate(), arr);
	}

	static void display(Predicate<Integer> p, Integer[] arr) {
		for (Integer i : arr)
			if (p.test(i))
				System.out.print(i + " ");
	}
}

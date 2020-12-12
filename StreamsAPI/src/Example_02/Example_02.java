// program to convert stream of elements into an array

package Example_02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example_02 {

	public static void main(String[] args) {

		// create a list to store Integer objects
		List<Integer> lst = new ArrayList<Integer>();

		// add elements to the list
		for (int i = 1; i < 10; i++)
			lst.add(i);

		// convert this array into stream using stream() method
		Stream<Integer> sm = lst.stream();

		// filter the elements which are lesser than 5 and collect them into an Integer
		// type array.
		Integer[] arr = sm.filter(i -> i < 5).toArray(Integer[]::new);

		// displaying array
		for (Integer i : arr)
			System.out.println(i);
	}
}

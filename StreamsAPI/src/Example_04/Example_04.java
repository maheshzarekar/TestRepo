package Example_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_04 {
	public static void main(String[] args) {

		// take a String type array and convert into a list
		List<String> lst = Arrays.asList("USA", "Japan", "India", "China", "", "Russia", "UK");

		// count the no. of strings with length more than 4 characters
		long n = lst.stream().filter(x -> x.length() > 4).count();
		System.out.println("No. of strings with length more than 4 : " + n);

		// count number of strings which starts with "U"
		n = lst.stream().filter(x -> x.startsWith("U")).count();
		System.out.println("No. of strings starting with U : " + n);

		// remove all empty strings from the list and collect them into another list
		List<String> lst1 = lst.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("The list after removing the empty strings : " + lst1);

		// sort the stream and then convert into upper case letters and collect into
		// another list
		List<String> lst2 = lst1.stream().sorted().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println("The list after sorting in uppercase : " + lst2);

		// sort the stream and then convert into upper case letters and collect into
		// another list
		String[] arr = lst2.stream().map(x -> x.toUpperCase()).toArray(String[]::new);
		System.out.print("Array of sorted strings in uppercase : ");
		for (String i : arr)
			System.out.print(i + " ");
	}
}

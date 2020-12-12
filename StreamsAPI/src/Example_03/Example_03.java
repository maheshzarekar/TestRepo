package Example_03;

import java.util.stream.Stream;

public class Example_03 {

	public static void main(String[] args) {
		
		// create a stream of Integer objects using Stream.of() method
		Stream<Integer> sm = Stream.of(10,11,12,13,14,15);
		
		//displaying the elements of the stream
		sm.forEach(System.out::println);
	}

}

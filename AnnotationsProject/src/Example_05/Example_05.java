// program to create a multi value annotation that stores only 3 values, one integer number and two strings. The annotation can also be  retrieved during runtime by JVM 

package Example_05;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyMulti {
	int value1();
	String value2();
	String value3();
}

@MyMulti(value1 = 10, value2 = "Om Sai", value3 = "Shirdi, Ahmednagar")
class MyClass {
	void myMethod() {
		System.out.println("Hello");
	}
}

public class Example_05 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class obj = Class.forName("Example_05.MyClass");
		Annotation[] annot = obj.getAnnotations();
		for (Annotation x : annot) {
			if (x instanceof MyMulti) {
				MyMulti a = (MyMulti) x;
				System.out.println("Value1= " + a.value1());
				System.out.println("Value2= " + a.value2());
				System.out.println("Value3= " + a.value3());
			}
		}
	}
}

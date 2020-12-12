// Program to create a single value annotation that stores only one value and retrieve it during runtime by the JVM

package Example_04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle {
	int value();
}

class MyClass {
	@MySingle(value = 100)
	public void myMethod() {
		System.out.println("Hello");
	}
}

public class Example_04 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyClass obj = new MyClass();
		Method m = obj.getClass().getMethod("myMethod");
		MySingle anno = m.getAnnotation(MySingle.class);
		System.out.println("Value=" + anno.value());
	}
}

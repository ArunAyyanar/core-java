package java8_concepts;

import java.util.function.Supplier;

public class HelloWorld {

	public static void main(String[] args) {

		
		Supplier<String> s = () -> "Hello World!!!";
		
		System.out.println(s.get());
		
		
	}

}

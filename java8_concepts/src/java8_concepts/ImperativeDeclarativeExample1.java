package java8_concepts;

import java.util.stream.IntStream;

public class ImperativeDeclarativeExample1 {

	public static void main(String[] args) {
		
		
		// Imperative way
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("sum ===> "+sum);
		
		// Declarative 
		
		
		int sum2 = IntStream.rangeClosed(1,100).sum();
		
		System.out.println("sum ===> "+sum2);

	}

}

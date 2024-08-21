package functionalinterfaces;
import java.util.function.Function;

public class ConsumerDemo {

	public static void main(String[] args) {

		Function<String,String> f1 = str -> str.concat("arun");
		
		Function<String,String> f2 = str -> str.toUpperCase();
		
		
	
		System.out.println(f1.andThen(f2).apply("welcome "));
		
		
	}

}

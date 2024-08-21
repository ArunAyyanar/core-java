package java8_concepts;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String str = "hello world arun welcome arun tamil sasi arun prabha world";
		
	
		Arrays.asList(str.split(""))
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
	

	}

}

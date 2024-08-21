package java8_concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegerDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(23,3,4,56,1,90);
		
		
		numList.sort((num1,num2)->{
			if(num1>num2)
				 return 1;
			else if(num1<num2)
				return -1;
			else
				return 0;
		});
		
		numList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}

}

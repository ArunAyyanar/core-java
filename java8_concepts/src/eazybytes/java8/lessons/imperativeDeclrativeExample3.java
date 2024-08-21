package eazybytes.java8.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class imperativeDeclrativeExample3 {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(23,3,4,6,1,2,3,7,6);
		
		// Imperative 
		
		List<Integer> unique1 = new ArrayList<>();
		numList.forEach(num->{
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		});
		
		System.out.println("unique1 :: "+unique1);
		
		// Declarative
		
		List<Integer> unique2 = numList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("unique2 :: "+unique2);
		

	}

}


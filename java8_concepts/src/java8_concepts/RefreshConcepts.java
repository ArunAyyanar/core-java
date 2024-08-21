package java8_concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RefreshConcepts {

	public static void main(String[] args) {
		
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running thread1");
				
			}
			
		};
		
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		
		new Thread(()->System.out.println("Running thread2")).start();
		
		// sorting
		
		
		List<Integer> numList = Arrays.asList(12,3,1,5,6,19,17,30,2);
		
		// old way of sorting
		
		int temp;
		for(int i=0;i<numList.size();i++) {
			for(int j = i+1;j<numList.size();j++) {
				if(numList.get(i)<numList.get(j)) {
				temp = numList.get(i);
				numList.set(i, numList.get(j));
				numList.set(j, temp);
				}
			}
		}
		
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
		
		// new way of sorting
		
		System.out.println("new way sorting");
		numList.stream()
		//.sorted(Comparator.reverseOrder())
		.sorted()
		.forEach(System.out::println);
		
		
	}

}


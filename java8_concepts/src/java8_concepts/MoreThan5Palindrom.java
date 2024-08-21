package java8_concepts;

import java.util.Arrays;
import java.util.List;

public class MoreThan5Palindrom {

	public static void main(String[] args) {
		
		
		String paragraph = "The kids were loud. They were way too loud for Jerry, madam, especially since this was a madam "
				+ "four-hour flight. The parents didn't seem to be able, or simply didn't want, "
				+ "to control them. They were yelling and fighting among themselves and it was "
				+ "impossible for any of the passengers to madam concentrate or rest. He thought about"
				+ " politely tapping on the parents' shoulders and madam asking them to try and get their "
				+ "kids under a bit more control, but before he did he madam came up madam with a better idea. "
				+ "Sure, it was a bit sinister, and he'd probably end p in a lot of trouble, but he really didn't care at that point.";

		
		List<String> stringList = Arrays.asList(paragraph.split(" "));
		
	
	
		boolean hasMoreThan5PalindromString = stringList.stream()
		.filter(str->str.length()>1)	
		.filter(str-> str.equals(new StringBuffer(str).reverse().toString()))
		.peek(System.out::println)
		.count()>4;
		
			
		
		System.out.println("Has more than 5 palindrom in this paragraph :: "+hasMoreThan5PalindromString);
		
		
	}

}

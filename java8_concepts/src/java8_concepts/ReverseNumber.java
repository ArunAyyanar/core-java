package java8_concepts;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 5823;
		int m;
		int reverseNumber=0;
		while(n!=0) {
			
			m = n % 10;
			reverseNumber=(reverseNumber*10)+m;
			n/=10;
		}
		System.out.println(reverseNumber);
		
	}

}

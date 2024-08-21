package java_core_concepts;

public class StringDemo {

	public static void main(String[] args) {

		
		String A = "madam1";
		
		StringBuffer sb = new StringBuffer(A);
		System.out.println(sb.reverse().toString().toLowerCase().equals(A)?"Yes":"No");
		
	}

}

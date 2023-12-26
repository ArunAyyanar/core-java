package java8_concepts;

public class RunnableExample {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("Runnable in java8")).start();

	}

}

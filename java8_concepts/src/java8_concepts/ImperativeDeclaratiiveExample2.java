package java8_concepts;

public class ImperativeDeclaratiiveExample2 {

	public static void main(String[] args) {
		
		
		// Imperative way - thread creation
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
			System.out.println("running thread1");	
			}
		};
		
		Thread t = new Thread(r);
		
		t.start();
		
		
		new Thread(() -> System.out.println("running thread2")).start();
	}

}

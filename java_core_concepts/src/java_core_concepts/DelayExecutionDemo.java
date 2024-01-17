package java_core_concepts;

public class DelayExecutionDemo {

	public static void main(String[] args) {

		
		for(int i =1;i<=10;i++) {
			
			
			System.out.println(i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}

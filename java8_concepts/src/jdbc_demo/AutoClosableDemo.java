package jdbc_demo;

class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("JVM called to close the resource");
	}
	
	public void readData() {
		System.out.println("reading the data");
	}

}

public class AutoClosableDemo {

	public static void main(String[] args) {

		
		try(MyResource myRs = new MyResource();){
			
			myRs.readData();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

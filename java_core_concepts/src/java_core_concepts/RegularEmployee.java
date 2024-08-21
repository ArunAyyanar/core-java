package java_core_concepts;

public class RegularEmployee implements Employee {
	
	private double salary;	

	public RegularEmployee(double salary) {
		this.salary = salary;
	}

	@Override
	public double increment() {
		return this.salary * 15.2 / 100;
	}

}

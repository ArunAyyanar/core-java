package java_core_concepts;

public class ContractEmployee implements Employee {

	private double salary;

	public ContractEmployee(double salary) {
		this.salary = salary;
	}

	@Override
	public double increment() {
		return this.salary * 10 / 100;
	}

}

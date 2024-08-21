package java_core_concepts;


public class PolymorphismDemo {

	public static void main(String[] args) {
		/*
		double currentSalary = 10000;
		
		Employee regEmp = new RegularEmployee(currentSalary);
		double regular_increments = regEmp.increment();		
		System.out.println("Regular employee");
		System.out.println("Current Salary :: "+currentSalary);
		System.out.println("Increment :: "+regular_increments);
		System.out.println("Increased Salary :: "+(currentSalary+regular_increments));
		
		Employee contEmp = new ContractEmployee(currentSalary);
		double contract_increments = contEmp.increment();
		System.out.println("Contract employee");
		System.out.println("Current Salary :: "+currentSalary);
		System.out.println("Increment :: "+contract_increments);
		System.out.println("Increased Salary :: "+(currentSalary+contract_increments));
		*/
		
		
		Calculator cal = new CalculatorImpl();
		
		System.out.println(cal.add(12.3, 11.2));
		System.out.println(cal.add(12.3, 11.2,30));
		System.out.println(cal.add(12.3, 11.2,30,45.7));
	}

}


package java8_concepts;

import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		
		List<Employee> employees = EmployeeData.getEmployees();
		System.out.println("Sort by name");
		employees.stream()
		.sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
		.forEach(System.out::println);
		
		System.out.println("Sort by id");
		employees.stream()
		.sorted((e1,e2)->e1.getId()-e2.getId())
		.forEach(System.out::println);
		
	}

}

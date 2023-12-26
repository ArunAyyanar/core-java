package java8_concepts;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	
	public static List<Employee> getEmployees(){
		
		List<Employee> allEmps = new ArrayList<>();
		
		allEmps.add(new Employee(23,"Prem","SRE"));
		allEmps.add(new Employee(4,"Arun","Full stack engineer"));
		allEmps.add(new Employee(1,"Srinath","Front end developer"));
		allEmps.add(new Employee(15,"Tamil","Front end developer"));
		
		return allEmps;
	}
	
}

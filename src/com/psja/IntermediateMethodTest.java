package com.psja;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class IntermediateMethodTest extends Object{

	public static void main( String args[] ) {
		Employee emp1 = new Employee("PSJA1", 6000, "dev");
		Employee emp2 = new Employee("PSJA2", 5000, "dev");
		Employee emp3 = new Employee("PSJA3", 4000, "test");
		Employee emp4 = new Employee("PSJA4", 3000, "test");
		Employee emp5 = new Employee("PSJA5", 2000, "dev");
		Employee emp6 = new Employee("PSJA6", 1000, "test");
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		System.out.println(empList);
		TestComparator testComparator = new TestComparator();
		List<Employee> sortedEmpList = empList.stream()
													.sorted()
													.collect(Collectors.toList());
		System.out.println(sortedEmpList);
	}
	
}

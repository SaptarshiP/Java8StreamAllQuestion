package com.psja;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class DuplicateKeysSorted {

	public static void main( String args[] ) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("2", "Saptarshi", 3000.00));
		empList.add(new Employee("3", "Pampa", 4000.00));
		empList.add(new Employee("1", "Shyamal", 1000.00));
		empList.add(new Employee("5", "Jyotsna", 1000.00));
		empList.add(new Employee("4", "Anima", 9000.00));
		
		empList.add(new Employee("3", "Pampa", 1000.00));
		
		empList.stream()
				.collect(Collectors.groupingBy(data->data.getEmpId(), Collectors.summingDouble(data->data.getEmpSal())))
				.entrySet()
				.stream()
				.sorted(Comparator.comparingDouble( data->data.getValue() ))
				.forEach(System.out::println);
	}
	
}

class Employee{
	
	private String empId;
	private String empName;
	private Double empSal;
	
	Employee( String empId, String empName, Double empSal ){
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public String getEmpId() {
		return this.empId;
	}
	public String getEmpName() {
		return this.empName;
	}
	public Double getEmpSal() {
		return this.empSal;
	}
}

class CustomComparator implements Comparator<Map<String, Double>>{
	
	@Override
	public int compare( Map<String, Double> emp1, Map<String, Double> emp2 ) {
//		if ( emp1.values() > emp2.values() )
//			return 1;
//		else if (  )
		return 0;
	}
	
}

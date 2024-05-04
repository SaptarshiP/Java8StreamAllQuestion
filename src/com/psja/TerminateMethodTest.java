package com.psja;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.function.Function;
import java.util.Map;

public class TerminateMethodTest {

	public static void main( String args[] ) {
		
		Employee emp1 = new Employee("PSJA1", 1000, "dev");
		Employee emp2 = new Employee("PSJA2", 2000, "dev");
		Employee emp3 = new Employee("PSJA3", 3000, "test");
		Employee emp4 = new Employee("PSJA4", 4000, "test");
		Employee emp5 = new Employee("PSJA5", 5000, "dev");
		Employee emp6 = new Employee("PSJA6", 6000, "test");
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		//Accumulates the element in hashset
		Set<Employee> empSet = empList.stream().collect(Collectors.toCollection(HashSet::new));
		System.out.println(empSet);
		//It is calling the apply method which takes one input and returns the output   
		Function<Object, String> func = (a)->a.toString();
		//it is calling the functional interface named Function for the map and the appending the string data to string
		System.out.println( empList.stream().map(func::apply).collect(Collectors.joining(",")) );
		//It is adding the empSal and gives the Summary information of all the data i.e IntSummaryStatistics{count=6, sum=21000, min=1000, average=3500.000000, max=6000}
		System.out.println(empList.stream().collect(Collectors.summarizingInt(Employee::getEmpSal)));
		//We are grouping the data with 
		Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept));
		System.out.println(empMap);
		Set<String> key = empMap.keySet();
		key.forEach(data->System.out.println(empMap.get(data).size()));
		
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(1);
		System.out.println(arrList.stream().collect( Collectors.groupingBy(a->a, Collectors.counting()) ));
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept, Collectors.counting()  )));
		//First it is grouping by and then adding the contents of the group
		System.out.println( empList.stream().collect( Collectors.groupingBy( Employee::getEmpDept, Collectors.summingInt( Employee::getEmpSal ) ) ) );
		//First the data is getting partitioned using the predicate and adding the salary.
		System.out.println( empList.stream().collect(Collectors.partitioningBy( data->data.getEmpDept().equalsIgnoreCase("test"), Collectors.summingInt( Employee::getEmpSal ) )) );
	}
	
}

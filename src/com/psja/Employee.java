package com.psja;

public class Employee {

	private String empName;
	private Integer empSal;
	private String empDept;
	
	public Employee( String empName, Integer empSal, String empDept ) {
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	public void setEmpName( String empName ) {
		this.empName = empName;
	}
	
	public Integer getEmpSal() {
		return this.empSal;
	}
	public void setEmpSal( Integer empSal ) {
		this.empSal = empSal;
	}
	
	public String getEmpDept() {
		return this.empDept;
	}
	public void setEmpDept( String empDept ) {
		this.empDept = empDept;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder(this.empName);
		strBuilder = strBuilder.append("||").append(this.empSal).append("||").append(this.empDept);
		return strBuilder.toString();
	}
}

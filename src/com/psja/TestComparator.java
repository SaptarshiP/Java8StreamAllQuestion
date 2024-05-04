package com.psja;

import java.util.Comparator;

public class TestComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee t1, Employee t2) {
		if ( t1.getEmpSal()<t2.getEmpSal())  {
			return 1;
		}else {
			return 0;
		}
	}
}

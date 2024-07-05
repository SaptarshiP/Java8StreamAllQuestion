package com.psja;

public class ParentClassVisibility {

	protected String data;
	
	ParentClassVisibility(String data){
		this.data = data;
	}
	
	protected void getTestV() {
		System.out.println("Hii i am here in parent class");
	}
}

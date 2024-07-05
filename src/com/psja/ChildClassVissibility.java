package com.psja;

public final class ChildClassVissibility extends ParentClassVisibility {

	ChildClassVissibility(){
		super("5");
	}
	
	@Override
	public void getTestV() {
		System.out.println(data);
	}
	
}

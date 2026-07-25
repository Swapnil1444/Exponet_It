package com.keywords.static_keyword;

public class Student {
	
	int id;
	String name;
	final static String clgName="DYPTC";
	
	@Override
	public String toString() {
		return "Student{ Id:"+id+" name:"+name+" ClgName:"+clgName+" }";
	}

}

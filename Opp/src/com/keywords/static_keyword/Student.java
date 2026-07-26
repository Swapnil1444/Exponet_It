package com.keywords.static_keyword;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
	int id;
	String name;
	final static String clgName="DYPTC";
	
	@Override
	public String toString() {
		return "Student{ Id:"+id+" name:"+name+" ClgName:"+clgName+" }";
	}
	
	public static void dateFormater() throws ParseException {
		
		String inputDate="20260725";
		SimpleDateFormat inputFormat=new  SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat outputFormat =new SimpleDateFormat("ddMMyyyy");
		Date date=inputFormat.parse(inputDate);
		String outputDate=outputFormat.format(date);
		System.out.println("Origin Date:"+inputDate);
		System.out.println("After Convartion:"+outputDate);
		
		
	}
	
	public static void main(String[] args) throws ParseException{
		Student.dateFormater();
		Student s=new Student();
//		s.dateFormater()
		dateFormater();

	}

}

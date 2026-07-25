package com.keywords.static_keyword;

public class StudentMng  {

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.id=101;
		s1.name="Swapnil";
		System.out.println(s1);
		//s1.clgName="PCET";
		System.out.println("Id:"+s1.id+" Name:"+s1.name+" ClgName:"+Student.clgName);
		System.out.println(s1);
		
		Student s2=new Student();
		s2.id=102;
		s2.name="Prachi";
		System.out.println(s2);
		
		Student s3=new Student();
		s3.id=103;
		s3.name="Jay";
		System.out.println(s3);
		

	}

}

package com.returntype;

public class Colloge {
	
	String collogeName;
	int collogeId;

	public Student StudentInfo() {
		Student s=new Student();
		s.sId=11;
		s.sName="Swapnil";
		return s;
	}
	
	public Colloge CollogeInfo() {
		Colloge c=new Colloge();
		c.collogeId=6501;
		c.collogeName="DYPTC";
		return c;
	}
	
	public static void main(String[] args) {
		
		Colloge c=new Colloge();
		Student s=c.StudentInfo();
		System.out.println  ("Student Info: \n Id:"+s.sId+"\n Name:"+s.sName);
		
		Colloge c1=c.CollogeInfo();
		System.out.println("Colloge Info: \n Colloge Id:"+c1.collogeId+"\n Colloge Name:"+c1.collogeName);
		
	}

}

package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentAdmin {

	public static void main(String[] args) {
		
		Student s=new Student(1, "swapnil");
		Student s1=new Student(5, "jay");
		Student s2=new Student(3, "ram");
		Student s3=new Student(6, "prachi");
		Student s4=new Student(2, "om");
		Student s5=new Student(9, "harsh");
		Student s6=new Student(4, "kisheor");
		
		
		List<Student> list=new  ArrayList<Student>();
		Collections.addAll(list, s,s1,s3,s4,s5,s6);
		
		System.out.println(list);
		
		//Collections.sort(list);
		

		
	}

}

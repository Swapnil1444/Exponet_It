package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import Model.Student;

public class SeriazationClass {

	public static void main(String[] args) throws IOException {
		
		Student s=new Student();
		s.setId(101);
		s.setName("swapnil");
		s.setAge(19);
		
		FileOutputStream file =new FileOutputStream("Student.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(s);
		

	}

}

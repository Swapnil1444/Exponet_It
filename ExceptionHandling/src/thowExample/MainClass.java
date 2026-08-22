package thowExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age:");
		try {
		int age=sc.nextInt();
		  try {
			  UseValidtions.validAge(age);
		  }catch(ArithmeticException e) {
			  System.out.println(e);
			  main(args);
		  }
		}catch (InputMismatchException e) {
			System.out.println("Invalid Input..!\n"+e);
			main(args);
		}

	}

}

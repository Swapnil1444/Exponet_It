package tryWithResources;

import java.util.InputMismatchException;
import java.util.Scanner;

import CastamException.AgeException;

public class tryWithResourcesExample {

	public static void main(String[] args)  {
		
		
		try(Scanner sc=new Scanner(System.in)){

			System.out.print("Enter age:");
			int age=sc.nextInt();
			if(age>=18) {
				System.out.println("Your the Egibles..");
			}else {
				throw new AgeException("Your undr the 18 not egible..!");
			}
		}catch (InputMismatchException| AgeException e) {
			System.out.println(e);
			
		}

	}

}

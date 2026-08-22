package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMutipleCatchBolck {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter number:");
			int i=sc.nextInt();
			System.out.println("i:"+i);
			System.out.println("10/i:"+(10/i));
			
		}catch (InputMismatchException e) {
			System.out.println(e);
			
		}catch (ArithmeticException e) {
		  System.out.println(e);
		  
		}

	}

}

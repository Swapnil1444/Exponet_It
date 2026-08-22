package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchUsingPipeline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		try {
			int i = sc.nextInt(); // InputMissMatchException
			System.out.println("i:" + i);
			System.out.println("10/i:" + (10 / i));// ArithmeticException

		} catch (InputMismatchException | ArithmeticException e) { // (|) Pipeline
			System.out.println(e);
			main(args);
		}

	}

}

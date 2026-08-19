package examples;

import java.util.Scanner;

public class Soultion3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Executable line 1");
		System.out.print("Enetr number:");
		try {
		int i=sc.nextInt();
		System.out.println("i="+i);
		}catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Executable line 2");
	}


}

package Qustions;

import java.util.Scanner;

public class demo {

	
	 static void show(Integer x) {
	        System.out.println("Integer");
	    }
	static void show(int x) {
        System.out.println("int");
    }

   

	
	public static void main(String[] args) {

		show(19);
		int x=5;
		System.out.println(x++);
		System.out.println(++x);
		
		String s=null;
		//System.out.println(s.length()); //null pointer extion
		int a=1;
		System.out.println(a++ + ++a);
		
		String s1 = null;

        System.out.println(s1 + "Java");

		
        
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the number:");
		int num = sc.nextInt();
		int sum = 0;
		if (num > 0) {
			while (num > 0) {

				int rev = num % 10;
				sum += rev;
				num = num / 10;
			}

			System.out.println("Sum:" + sum);

		}else {
			System.out.println("Enetr positiv number");
		}
		
		
		//System.out.println(10.0/0.0);
		
	}

}

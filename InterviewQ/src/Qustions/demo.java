package Qustions;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

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
	}

}

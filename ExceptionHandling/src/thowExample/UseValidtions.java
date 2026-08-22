package thowExample;

public class UseValidtions {

	public static void validAge(int age) {
		if(age>=18) {
			System.out.println("Account Creat...!");
		}else {
			throw new ArithmeticException("\nyour not Eligible to crate bank account..!");
		}
	}
}

package string.allmethods;

public class StringAllMethods {

	public static void main(String[] args) {
		
		String s=" Hello I am Swapnil ";
		System.out.println(s);
		System.out.println(s.length());
		s=s.trim(); // remove the frist and last space
		System.out.println(s);
		System.out.println(s.length());

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		char []ch=s.toCharArray();
		for (char c : ch) {
			System.out.print(c+" ");
		}
		
		
	}

}

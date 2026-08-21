package examples;

public class IneerTryCatchBlock {

	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			System.out.println("outar try block");
			int i=Integer.parseInt(args[0]);
			System.out.println("i :"+i);
			
			try{
				System.out.println("inner try block");
				System.out.println((10/i));
			}catch (ArithmeticException e) {
				System.out.println("inner catch block");
				System.out.println(e);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ineer catch block");
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("End Main");
	}

}

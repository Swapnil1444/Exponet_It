package examples;

public class Solution2 {

	public static void main(String[] args) {

		System.out.println("Executable line");
		try {
		int i=3/0;
		System.out.println(i);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("not divide by 0");
		}
		System.out.println("Not Executable line");

	}

}

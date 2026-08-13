package string.basic;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-way of define
		String s1="java"; //constent heap memory
		String s2=new String("java");//heap memory
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);//refer to the address
		System.out.println(s1.equals(s2));//refer to cha value
		

	}

}

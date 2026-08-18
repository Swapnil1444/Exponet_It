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
		
		char []ch=s.toCharArray(); //single single char to div
		for (char c : ch) {
			System.out.print(c+" ");
		}
		
		System.out.println("\n");
		//sptlit cha world in the " ".
		String [] arr=s.split(" ");
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println("\n");
		System.out.println(s.charAt(2));//return spacific char
		System.out.println();
		
		System.out.println("\n");
		// boolen
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("23ss"));
		System.out.println("\n");
	
		String s1="swapnil";
		String s2="Swapnil";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "I love Java ";
		String s4 = "Programming";
		String s5=s3.concat(s4);
		System.out.println(s5);
		
		System.out.println(s4.substring(4));
		
		System.out.println(s5.contains("Java")); //check meching char
		
		System.out.println(s5.replace("a","0" ));
		
		System.out.println(s5.indexOf("J"));
		
		System.out.println(s5.lastIndexOf("a"));
		
		System.out.println("".isEmpty()+" "+" hello".isEmpty());//boolen
		
		System.out.println(s3.compareTo(s5)); // 
		
		int i=300;
		String sNum=String.valueOf(i); 
		System.out.println(sNum);
		
		//join
		String s8=String.join("=",s5,"it","is","best");
		System.out.println(s8);
		
		System.out.println(s5.subSequence(2, 10));
		
		String I="I love java";
		I=I.replaceAll("java", "Python");
		System.out.println(I);
		
		String s01="wertyu54567uiuytfc";
	    System.out.println(s01.replaceAll("[0-9]",""));
	    
	    //format
	    String myage=String.format("my age is %d", 22);
	    System.out.println(myage);
	    
	    String name=String.format("my name is %s and my age is %d","swapnil",22 );
	    System.out.println(name);
	    
	    
		
		
		
		
		
		
		
		
		
		
	}

}

package aggrigation;

public class SMSMain {

	public static void main(String[] args) {
		
		Cours c=new Cours();
		c.setcId(101);
		c.setcName("Java");
		System.out.println(c);
		
		Facalty f=new Facalty();
		f.setfId(11);
		f.setfName("Om");
		f.setC(c);
		System.out.println(f);
		
		Batch b=new Batch();
		b.setbId(75);
		b.setbName("B75");
		b.setF(f);
		System.out.println(b);
		
		
		
		Student s=new Student();
		s.setsId(001);
		s.setsName("Swapnil");
		s.setB(b);
		
		System.out.println(s);
		

	}

}

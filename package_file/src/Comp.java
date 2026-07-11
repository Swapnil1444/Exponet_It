
public class Comp {

	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.id=101;
		e1.name="abc";
		e1.salary=200000.11;
		System.out.println("Emp-:\n Id:"+e1.id+"\n name:"+e1.name+"\n salary:"+e1.salary);

		Emp e2=new Emp();
		e2.id=102;
		e2.name="zyz";
		e2.salary=400000.11;
		System.out.println("Emp-:\n Id:"+e2.id+"\n name:"+e2.name+"\n salary:"+e2.salary);
		
		Emp e3=new Emp();
		e3.id=103;
		e3.name="zzz";
		e3.salary=456789.11;
		System.out.println("Emp-:\n Id:"+e3.id+"\n name:"+e3.name+"\n salary:"+e3.salary);
	}

}

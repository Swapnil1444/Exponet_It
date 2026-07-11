
public class Employee {
 int eid;
 String ename;
 public Employee() {
	System.out.println("Costractor in Employee");
}
 public static void main(String[] args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	
	e1.eid=101;
	e1.ename="Jay";
	
	e2.eid=102;
	e2.ename="Ram";
	
	System.out.println("Emp Id:"+e1.eid+" name:"+e1.ename);
	System.out.println("Emp Id:"+e2.eid+" name:"+e2.ename);
}
}

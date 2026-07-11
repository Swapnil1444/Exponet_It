
public class MethodsCall {

	int id;
	String name;
	public MethodsCall() {
		
		System.out.println("In Constractor");
		m1();
		MethodsCall m=new MethodsCall();
	}
	 public void m1() {
		 System.out.println("In m1 method");
		 System.out.println(id+" "+name);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsCall mc=new MethodsCall();
		mc.id=101;
		mc.name="swapnil";
		
		mc.m1();

	}

}

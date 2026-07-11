package com.returntype;

public class demo {

	public int m1() {
		return 10;
	}

	public String m2() {
		return "Swapnil";
	}

	public double m3() {
		return 10.33;
	}

	public char m4() {
		return 'e';
	}
	
	public boolean m5() {
		return true;
	}
	
	public Emp addEmp() {
		Emp e=new Emp();
		e.eid=101;
		e.ename="swapnil";
		e.salary=200.33;
		return e;
	}
	
	public Company addCompany() {
		Company c=new Company();
		c.comid=11;
		c.Comname="Google";
		return c;
	}

	public static void main(String[] args) {

		demo d = new demo();
		int i = d.m1();
		System.out.println(i);

		String s = d.m2();
		System.out.println(s);

		double du = d.m3();
		System.out.println(du);

		char c = d.m4();
		System.out.println(c);
		
		boolean b=d.m5();
		System.out.println(b);
		
		Emp e=d.addEmp();
		System.out.println("Emp id"+e.eid+" name:"+e.ename+" salary:"+e.salary);

		Company c1=d.addCompany();
		System.out.println("Company id:"+c1.comid+" name:"+c1.Comname);
	}

}

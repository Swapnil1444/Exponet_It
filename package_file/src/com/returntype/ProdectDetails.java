package com.returntype;

public class ProdectDetails {
	
	public Prodect addProdect() {
		Prodect p=new Prodect();
		p.pid=11;
		p.pname="Mobile";
		p.price=20000.00;
		
		return p;	
	} 
	
	public Ordar addOrdar() {
		Ordar o=new Ordar();
		
		o.oId=001;
		o.oNumber=123;
		o.address="pune";
		
		
		return o;
	}
	
	public Costoumer addCostoumer() {
		Costoumer c=new Costoumer();
		c.name="Swapnil Supekar";
		c.contect="9309144435";
		c.eamil="ex@gmail.com";
		
		
		return c;
	}

}

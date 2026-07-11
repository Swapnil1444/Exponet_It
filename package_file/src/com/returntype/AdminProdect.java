package com.returntype;

public class AdminProdect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProdectDetails pd=new ProdectDetails();
		
		Prodect p=pd.addProdect();
		System.out.println("Prodect Info:\n Id:"+p.pid+" \n Name:"+p.pname+"\n  Price:"+p.price);
 
		Ordar o=pd.addOrdar();
		System.out.println("Ordar Info:\n Id:"+o.oId+" \n OrderNumber:"+o.oNumber+"\n Address:"+o.address);
		
		Costoumer c=pd.addCostoumer();
		System.out.println("Costoumer Info:\n Name:"+c.name+" \n Email:"+c.eamil+"\n Conect No:"+c.contect);
	}

}

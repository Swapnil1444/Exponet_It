package com.arrayExamples;

public class Prodect {

	private int pId;
	private String pName;
	private double price;
	
	public Prodect(int pId, String pName, double price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Prodect [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	
	
}

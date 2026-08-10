package com.arrayExamples;

public class MainClass {

	public static void main(String[] args) {

		Prodect[] arrProdects = { new Prodect(101, "pen", 10), new Prodect(102, "leptop", 200000),
				new Prodect(103, "camera", 400) };
		
		for (Prodect prodect : arrProdects) {
			System.out.println(prodect);
		}

	}

}

package com.sbi;

import java.util.Scanner;

public class SBI {
	
	
	int aNum;
	String name,pass;
	double bal;
	Scanner sc=new Scanner(System.in);
    Account acc=new Account();
	
	public SBI(int aNum,String pass,String name,double bal ) {
		this.aNum=aNum;
		this.bal=bal;
		this.name=name;
		this.pass=pass;
		
	}
	
    
	public void mainMenu() {
		System.out.println(" \n **** SBI BANKING **** \n ");
		System.out.println("\n 1.Login\n 2.SignIn \n 3.Exit");
		System.out.print("Select Option:");
		int a=sc.nextInt();
		System.out.println();
		
		switch (a) {
		case 1: {
			acc.login(aNum,pass,name,bal);
			break;
		}
		case 2:{
			
			acc.singIn();
			break;
		}
		case 3:{
			System.out.println("Exit Thanks of use appliction...!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " +a);
		}
		
		
		
	}

}

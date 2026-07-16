package com.sbi;

public class User {
	
	int accountNum;
	String password;
	String name;
	double bal;
	
//	public User(int accountNum,String password,String name,double bal) {
//		this.accountNum=accountNum;
//		this.bal=bal;
//		this.name=name;
//		this.password=password;
//	} 
	
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void displayAccDetails() {
		System.out.println("Account name:"+name+" password:"+password+" Balans:"+bal+" Passwod:");
	}

}

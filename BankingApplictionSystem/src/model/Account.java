package model;

public class Account {

	private long accountNumber = 1234;
	private String accountHolderName;
	private double balance = 5000;
	private String accountType;
	private final String ifscCode = "UBIN0916757";
	private final String branchName = "Akurdi";
	private long mobileNumber;
	private String email;
	private String address;
	private final double minimumBalance = 1000;
	private boolean status = true;
	private String adarNum;
	private String panNum;

	public String getAdarNum() {
		return adarNum;
	}

	public void setAdarNum(String adarNum) {
		this.adarNum = adarNum;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {

		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public String toString() {
		return "-------Account Details-------"
				+ "\n\nAccount Number:" + accountNumber + 
				"\nAccount Holder Name:"+ accountHolderName + 
				"\nBalance:" + balance + ""
				+ "\nAccount Type:" + accountType + "\nAadhaar Number:"
				+ adarNum + "\nPan Card Number:" + panNum + "\nIFSC Code:" + ifscCode + "\nBranch Name:" + branchName
				+ "\nMobile Number:" + mobileNumber + "\n" + "Email:" + email + "\nAddress:" + address + "\nStatus:"
				+ status;
	}
	
	public void displayAccDetails() {
		System.out.println("=======================================");
		System.out.println("           Account Details             ");
		System.out.println("=======================================");
		System.out.println("Account Number      : "+ accountNumber);
		System.out.println("Account Holder Name : "+ accountHolderName);
		System.out.println("Balance             : "+ balance);
		System.out.println("Account Type        : "+ accountType);
		System.out.println("Aadhaar Number      : "+ adarNum);
		System.out.println("Pan Card Number:    : "+ panNum);
		System.out.println("IFSC Code           : "+ ifscCode);
		System.out.println("Branch Name         : "+ branchName);
		System.out.println("Mobile Number       : "+ mobileNumber);
		System.out.println("Email               : "+ email);
		System.out.println("Address             : "+ address);
		System.out.println("Status              : "+ status);
		System.out.println("=======================================");
	
	}
	
//	public static void main(String[] args) {
//		Account a=new Account();
//		System.out.println(a);
//		
//		System.out.println("------------------");
//		a.displayAccDetails();
//	}

}

package services;

import java.io.IOException;

public interface RBI {
	
	void createAccount() throws IOException;
	void displayAllAccountDetails();
	void checkBalance();
	void deposit();
	void withdraw();
	void updateAccountInfo();

}

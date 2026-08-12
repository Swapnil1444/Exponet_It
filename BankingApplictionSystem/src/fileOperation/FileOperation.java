package fileOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Account;

public class FileOperation {

	public static void saveAccount(Account ac) throws IOException {
		
		FileWriter fw=new FileWriter("Accounts.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(ac.getAccountNumber()+","+ac.getAccountHolderName()+","+ac.getAccountType()+","+ac.getAdarNum()+","+ac.getAddress()+","+ac.getBalance()+","+ac.getBranchName());
		bw.newLine();
		bw.close();
		System.out.println("\nAccount No:"+ac.getAccountNumber()+"\nNew Account create successfully...😎\n");
	}
	
}

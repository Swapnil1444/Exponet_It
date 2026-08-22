package CastamException;

public class MainClass {
	
	public static void withdraw( int bal,int amount) throws InsuficientBalanceException {
		if(bal<=amount) {
			throw new InsuficientBalanceException("\n Insuficient Balance Exception your Garib..!");
		}else {
			System.out.println("Withdraw successfully..!");
		}
		
	}

	public static void main(String[] args) {
	
		try {
			
			withdraw(100, 200);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

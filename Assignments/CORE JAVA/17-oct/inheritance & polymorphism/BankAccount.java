import java.util.Scanner;

public class BankAccount{
	private String accHolderName;
	private int accID;
	
	public BankAccount(String accHolderName,int accID){
		this.accHolderName = accHolderName;
		this.accID = accID;
	}
	
	public int calculateBalance(){
		return 0;
	}

	public static void main(String args[]){
		
		BankAccount B[] = new BankAccount[2];
		B[0] = new SavingsAccount("ABC",50);
		B[1] = new CurrentAccount("XYZ",2000);
		
	}
}

class SavingsAccount extends BankAccount{
	public void fixedDeposit(){
		
	}
}

class CurrentAccount extends BankAccount{
	public void cashDeposit(){
		
	}
}
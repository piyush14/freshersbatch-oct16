import java.util.Scanner;

class Account{
	private static int totalAmount;
	private int accountNO,depositAmount,withDrawAmount;
	
	public void deposit(Account account){
	System.out.println("Enter amount you want to DEPOSIT.");
	Scanner sc = new Scanner(System.in);
	account.depositAmount = sc.nextInt();
	Account.totalAmount = Account.totalAmount + account.depositAmount;
	System.out.println("amount SUCCESSFULLY DEPOSITED");
	
	}
	
	public void withDraw(Account account){
	System.out.println("Enter amount you want to WITHDRAW.");
	Scanner sc = new Scanner(System.in);
	withDrawAmount = sc.nextInt();
	Account.totalAmount = Account.totalAmount - account.withDrawAmount;
		
	}
	
	public void print(Account account){
		System.out.println("PRINT");
		System.out.println("ACCOUNT NO. " + account.accountNO );
		System.out.println("TOTAL BALANCE :"+Account.totalAmount );
		
	}
	
	public static void main(String args[]){
		int choise;
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		System.out.println("Enter ACCOUNT NO.");
		account.accountNO = sc.nextInt();
		
		
		do{
			System.out.println("enter OPERATION you want to perform");
			System.out.println("1.DEPOSIT "+"\n2.WITHDRAW"+"\n3.PRINT"+"\n4.EXIT");
			choise = sc.nextInt();
			switch(choise){
			case 1 :
					account.deposit(account);
					break;
			case 2 : 
					account.withDraw(account);
					break;
			case 3 : 
					account.print(account);
					break;
			
			}
		}while(choise!=4);
	}
}
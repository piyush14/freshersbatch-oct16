import java.util.Arrays;
 import java.util.Scanner;
public class Login  {
	public static void main(String args[]){
		String userID,password;
		int attempt=0;
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<3;i++){
			
		System.out.println("Enter USERID ");
		userID = sc.nextLine();
		
		System.out.println("Enter PASSWORD ");
		password = sc.nextLine();
			
			
		if(userID.equals("admin") && password.equals("admin")){
			System.out.println("WELCOME ");
			break;

		}
		else{
			attempt++;
			System.out.println("TRY AGAIN " + attempt);
			continue ;
		}
   }  
   if(attempt=3){
	   System.out.println("CONTACT ADMIN");

		}
	}
}
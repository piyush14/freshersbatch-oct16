import java.util.Arrays;
 import java.util.Scanner;
 import java.util.Random;
public class Lottery  {
	public static void main(String args[]){
		 Random rand = new Random();
	Scanner sc = new Scanner(System.in);
    int randomNum[ ] = new int[6];
    int userNum[] = new int[6];

	for(int i=0;i<6;i++){
			randomNum[i] = rand.nextInt((49 - 1) + 1) + 1;
		}
	System.out.println("Enter 6 numbers");
		for(int i=0;i<6;i++){
			System.out.println("Number "+(i+1));
			userNum[i]=sc.nextInt();
		}
		System.out.println("RANOMLY GENERATED NOS :");
		for(int i=0;i<6;i++){
			System.out.println(randomNum[i]) ;
		}
		
		System.out.println("INPUT NOS :");
		for(int i=0;i<6;i++){
			System.out.println(userNum[i]) ;
		}
		
		int totalMatches = 0;
		for (int i = 0; i < userNum.length; i++) {
			if (randomNum[i] == userNum[i])
				totalMatches++;
		}
		if (totalMatches == 6)
			System.out.println("YOU ARE WINNER");
		else{
			System.out.println("TOTAL MATCHES :"+ totalMatches);
			
		}

	}
		
		
		
	
}
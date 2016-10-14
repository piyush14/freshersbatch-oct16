import java.util.Arrays;
 import java.util.Scanner;
public class Sort{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int m[] = new int[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter marks ");
			m[i] = sc.nextInt();
		}
		if(m[0]>60 && m[1]>60 && m[2]>60)
		{
			System.out.println("PASS");

		}
		else if((m[0]>60 && m[1]>60) || (m[1]>60 && m[2]>60) || (m[0]>60 && m[2]>60) ){
			System.out.println("PROMOTED");

		}
		else{
			System.out.println("FAILED");

		}
	}
}
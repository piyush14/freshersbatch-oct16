import java.util.Arrays;
 import java.util.Scanner;
public class Table{
	public static void main(String args[]){
		 int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		no = sc.nextInt();
		
		for(int i=1 ;i<=10;i++){
			System.out.println(no + " * "+i +" = "+ no*i);
		}
	}
}
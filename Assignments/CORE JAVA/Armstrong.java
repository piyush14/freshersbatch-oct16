import java.util.Arrays;
 import java.util.Scanner;
public class Armstrong{
	public static void main(String args[]){
		 int no,originalNo,a,c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		no = sc.nextInt();
		originalNo = no;
		while(no>0)  
		{  
			a=no%10;  
			no=no/10;  
			c=c+(a*a*a);  
		}  
    if(originalNo==c)  
		System.out.println("It's ARMSTRONG NO");   
    else  
        System.out.println("Not ARMSTRONG NO");   
   }  
	
}
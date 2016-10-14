import java.util.Arrays;
 import java.util.Scanner;
public class ArmstrongRange  {
	public static void main(String args[]){
		// int no,originalNo=0,a,c=0;
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter Number");
		//no = sc.nextInt();
		int n, count = 0, a, b, c, sum = 0;
      
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.println("ARMSTRONG NO's"+i);
            }
            sum = 0;
        }
   }  
	
}
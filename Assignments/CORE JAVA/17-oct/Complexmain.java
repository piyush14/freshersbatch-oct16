import java.util.Scanner;

class Complex{
	int Real,Imag;
	
	public Complex()
	{}
	Complex(int Real1,int Imag1)
	{
		Real=Real1;
		Imag=Imag1;
	}
	public Complex addComplex(Complex C1,Complex C2)
	{
		Complex CSum=new Complex();
		CSum.Real=C1.Real+C2.Real;
		CSum.Imag=C1.Imag+C2.Imag;
		return CSum;
	}
	
	
	public Complex subComplex(Complex C1,Complex C2)
	{
		Complex CSum=new Complex();
		CSum.Real=C1.Real-C2.Real;
		CSum.Imag=C1.Imag-C2.Imag;
		return CSum;
	}
	
	public Complex mulComplex(Complex C1,Complex C2)
	{
		Complex CSum = new Complex();
		
		CSum.Real = C1.Real * C2.Real - C1.Imag * C2.Imag;
		CSum.Imag = C1.Imag * C2.Real + C1.Real * C2.Imag;
		return CSum;
	}
	
	public Complex divComplex(Complex C1,Complex C2)
	{
		//Complex CSum = new Complex();
		
		////////////////////////////////////////////////
		
		int temp1,temp2,temp3;
		Complex CSum=new Complex();
		/*if ( C1.Real == 0 && C2.Imag == 0 ){
			System.out.println("Division by 0 + 0i is not allowed.");
			return CSum;

		}
		else*/
		{
			
			CSum.Real=C1.Real/C2.Real;
			CSum.Imag=C1.Imag/C2.Imag;
			return CSum;
		}
		
		
		
		//////////////////////////////////////////		
	}
}
 
class Complexmain
{
	
	public static void main(String[] args)
	{
		int choise;
		Complex C1=new Complex(4,8);
		Complex C2=new Complex(5,7);
		Complex C3=new Complex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choise");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIPLY");
		System.out.println("4.DIVIDE");
		choise = sc.nextInt();
		
		switch(choise){
			case 1 :
				C3=C3.addComplex(C1,C2);
				System.out.println("ADDITION :" + C3.Real +" + " + C3.Imag+"i");
				break;
				
			case 2 : 
				C3=C3.subComplex(C1,C2);
				System.out.println("SUBSTRACTION  :" + C3.Real +" + " + C3.Imag+"i");
				break;
				
			case 3 : 
				C3 = C3.mulComplex(C1,C2);
				System.out.println("MULTIPLICATION  :" + C3.Real +" + " + C3.Imag+"i");
				break;
				
			case 4 : 
				C3 = C3.divComplex(C1,C2);
				System.out.println("DIVISION  :" + C3.Real +" + " + C3.Imag+"i");
				break;
				
		}
		
	}
	
}
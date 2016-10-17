import java.util.scanner;

class ComplexNumbers{
	int Real,Imag;
	Complex()
	{}
	Complex(int Real1,int Imag1)
	{
		Real=Real1;
		Imag=Imag1;
	}
	Complex AddComplex(Complex C1,Complex C2)
	{
		Complex CSum=new Complex();
		CSum.Real=C1.Real+C2.Real;
		CSum.Imag=C1.Imag+C2.Imag;
		return CSum;
	}
}
 
class Complexmain
{
	public static void main(String[] args)
	{
		Complex C1=new Complex(4,8);
		Complex C2=new Complex(5,7);
		Complex C3=new Complex();
		C3=C3.AddComplex(C1,C2);
		System.out.println("SUM:" + C3.Real +"+i" + C3.Imag);
	}
	
}
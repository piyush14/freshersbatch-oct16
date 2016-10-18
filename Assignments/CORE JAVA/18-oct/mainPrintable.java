 interface Printable{
	void print();
}

class Employee implements Printable{
	public void print(){
		System.out.println("PRINT EMPLOYEE");
	}
}

class Circle implements Printable{
	public void print(){
		System.out.println("PRINT CIRCLE");
	}
}

public class mainPrintable{
	public static void main(String args[]){
		Printable p[] = new Printable[4];
		
		p[0] = new Employee();
		p[1] = new Employee();
		p[2] = new Circle();
		p[3] = new Circle();
		
		mainPrintable.printAll(p);
		//for(int i=0 ; i < p.length ; i++)
			//p[i].print();
	}
	
	public static void printAll(Printable p[]){
		for(int i=0 ; i<p.length ; i++)
			p[i].print();
	}
}
public interface Printable{
	void print();
}

class Employee implements Printable{
	void print(){
		System.out.println("PRINT EMPLOYEE");
	}
}

class Circle implements Printable{
	void print(){
		System.out.println("PRINT CIRCLE");
	}
}
import java.util.Scanner;

public class Employee{
	private int empID;
	private String name;
	private int salary;
	
	public Employee(int empID,int salary, String name){
		this.empID = empID;
		this.salary = salary;
		this.name = name;	
	}
	
	public int calculateSalary(){
		return this.salary;
	}
	
	public String toString(){
		return "return";
	}
	
	public static void printTotalSalary(Employee E[]){
		System.out.println("LABOUR SALARY : " + E[0].calculateSalary());
		System.out.println("MANAGER SALARY : " + E[1].calculateSalary());
		System.out.println("TOTAL SALARY : " + (E[0].calculateSalary()+E[1].calculateSalary()));
		
	}
	public static void main(String args[]){
		
		
		Employee E[] = new Employee[2];
		E[0] = new Labour(101,5000,"ABC",50);
		E[1] = new Manager(201,25000,"XYZ",2000);
		
		

		Employee.printTotalSalary(E);
		
	}
	
	
}

 class Labour extends Employee{
	 private int overTime;
	 public Labour(int empID,int salary, String name,int overTime){
		super(empID,salary,name);
		this.overTime = overTime;
	}
	
	public int calculateSalary(){
		return super.calculateSalary() + overTime ;
	}
	
}

 class Manager extends Employee{
	 private int insentive;
	 public Manager(int empID,int salary, String name,int insentive){
		super(empID,salary,name);
		this.insentive = insentive;
	}
	public int calculateSalary(){
		return super.calculateSalary() + insentive ;

	}

}

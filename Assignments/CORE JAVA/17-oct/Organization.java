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
	
	public void calculateSalary(){
		
	}
	
	
	
	public static void main(String args[]){
		Employee E1 = new Labour()
		
	}
	
}


 class Labour extends Employee{
	 private int overTime;
	 public Labour(int empID,int salary, String name,int overTime){
		super(empID,salary,name);
		this.overTime = overTime;
	}
}

 class Manager extends Employee{
	 private int insentive;
	 public Labour(int empID,int salary, String name,int insentive){
		super(empID,salary,name);
		this.insentive = insentive;
}



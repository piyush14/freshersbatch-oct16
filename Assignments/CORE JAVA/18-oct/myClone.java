class Employee implements Cloneable{
	
	public Employee(int ID,String name){
		this.ID = ID;
		this.name = name;
	}
	int ID;
	String name;
	public int getEmpoyeeId(){
		return this.ID;
	}
	public String getEmpoyeeName(){
		return this.name;
	}
	
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class myClone  {
	public static void main(String args[]){
		Employee e = new Employee(10,"ABC");
		System.out.println("ORIGINAL : "+e.getEmpoyeeId()+" "+e.getEmpoyeeName() +" HASHCODE : "+e.hashCode());
		try{
			Employee cloned = (Employee) e.clone();
			System.out.println("CLONED : "+cloned.getEmpoyeeId()+" "+e.getEmpoyeeName()+" HASHCODE : "+cloned.hashCode());
		}
		catch(CloneNotSupportedException err) {
            err.printStackTrace();
        }
		
	}
}
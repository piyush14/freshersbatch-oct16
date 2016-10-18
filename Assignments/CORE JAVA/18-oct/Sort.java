 interface Sortable{
    
	boolean compare(Sortable s1);
	int get();
}

class Employee implements Sortable{
	private int ID;
	public Employee(int ID){
		this.ID = ID;
	}
	public int get(){
		return this.ID;
	}
	public boolean compare(Sortable s1){
		if(this.ID < s1.get()){
			return true;
		}
		else 
			return false;
	}
	 public String toString() {
        return "ID :" + this.ID;

    }
}

class Circle implements Sortable{
	private int radius;
	public boolean compare(Sortable s1){
		if(this.radius < s1.get()){
			return true;
		}
		else 
			return false;
	}
	 public int get(){
		return this.radius;
	}
}

public class Sort{
	public static void main(String args[]){
		Sortable s[] = new Sortable[5];
		s[0] = new Employee(3);
		s[1] = new Employee(5);
		s[2] = new Employee(10);
		s[3] = new Employee(1);
		s[4] = new Employee(7);
		
		Sort.sortAll(s);
		printAll(s);
		
		
		Sortable s1[] = new Sortable[5];
		s1[0] = new Employee(3);
		s1[1] = new Employee(5);
		s1[2] = new Employee(10);
		s1[3] = new Employee(1);
		s1[4] = new Employee(7);
		
		Sort.sortAll(s);
		printAll(s);
	}
	
	public static void sortAll(Sortable s[]){
		for(int i=0 ; i < s.length ; i++){
			for(int j=0 ; j < s.length ; j++){
				if(s[i].compare(s[j])){
					Sortable temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
	
	public static void printAll(Sortable s[]){
		for(int i=0 ;i<s.length;i++){
			System.out.println(s[i].toString());
		}
	}
	
	
	
	

}
import java.util.*;

class Person implements Comparable<Person>{
	private String name;
	private int height;
	private int weight;
	
	public Person(String name, int height,int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public int compareTo(Person p){
		
		if(this.height > p.height){
			return 1;
		}
		else if(this.height < p.height){return -1;}
		else{
			return 0;
		}
	}
	
	public String getName(){
		return this.name;
	}
	public int getHeight(){
		return this.height;
	}
	public int getWeight(){
		return this.weight;
	}
	
}


public class myComparator{
	public static void main(String args[]){
		List <Person> L = new ArrayList<Person>();

		L.add(new Person("ABC",20,60));
		L.add(new Person("XYZ",60,70));
		L.add(new Person("PQR",10,75));
		
		Collections.sort(L);
		
		for(Person p1 : L){
			System.out.println(p1.getName()+"  " + p1.getHeight()+"  " + p1.getWeight());
		}
		
	}
}
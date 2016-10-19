import java.util.*;

class Person {
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

class compareByHeight implements Comparator{
	
	public int compare(Object o1 , Object o2){
		
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		if(p1.getHeight() > p2.getHeight()){
			return 1;
		}
		else if(p1.getHeight() < p2.getHeight()){
			return -1;
		}
		else{
			return 0;
		}
		
	}
}

class compareByWeight implements Comparator{
	public int compare(Object o1 , Object o2){
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		if(p1.getWeight() > p2.getWeight()){
			return 1;
		}
		else if(p1.getWeight() < p2.getWeight()){
			return -1;
		}
		else{
			return 0;
		}
		
	}
}


public class myComparator{
	public static void main(String args[]){
		List <Person> L = new ArrayList<Person>();

		L.add(new Person("ABC",20,60));
		L.add(new Person("XYZ",60,70));
		L.add(new Person("PQR",10,75));
		
		Collections.sort(L,new compareByHeight());
		System.out.println("SORT BY HEIGHT");
		for(Person p1 : L){
			System.out.println(p1.getName()+"  " + p1.getHeight()+"  " + p1.getWeight());
		}
		
		Collections.sort(L,new compareByWeight());
		System.out.println("SORT BY WEIGHT");
		for(Person p1 : L){
			System.out.println(p1.getName()+"  " + p1.getHeight()+"  " + p1.getWeight());
		}
		
	}
}
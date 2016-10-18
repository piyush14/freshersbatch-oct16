abstract class Persistance{
	abstract void persist();
}

class FilePersistance extends Persistance{
	void persist(){
		System.out.println("DATA PERSISTANCE INTO FILE");
	}
}

class DatabasePersistance extends Persistance{
	void persist(){
		System.out.println("DATA PERSISTANCE INTO DATABASE");
	}
	
}

class PersistanceFactory{
	public static Persistance getPersistance{
		return new FilePersistance();
	}
}

public class persist {
	public static void main(String args[]){
		Persistance p = PersistanceFactory.getPersistance();
		p.persist();
	}
}
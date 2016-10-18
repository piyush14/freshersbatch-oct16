import java.util.Scanner;

abstract class DessertItem{
	abstract int getCost();
	 int price;
	 int tax;
}

class Candy extends DessertItem{
	int tax ;
	public int price ;
	static int quantity;
	int getCost(){
		return price;
	}
}

class Cookie extends DessertItem{
	int tax ;
	int price;
	static int quantity;
	int getCost(){
		return price;
	}
}

class IceCream extends DessertItem{
	int tax ;
	public int price;
	static int quantity;
	int getCost(){
		return price;
	}
}


public class NewDessertShop{
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<String>();

	}
}


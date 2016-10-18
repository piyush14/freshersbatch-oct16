import java.util.Scanner;
import java.util.ArrayList;


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


public class DessertShop {
	public static void main(String args[]){
		ArrayList<DessertItem> obj = new ArrayList<DessertItem>();

		int choise,orderNO,ownerChoise,customerQuantity;
		Scanner sc = new Scanner(System.in);
		DessertItem  d[] = new DessertItem[3];
		d[0] = new Candy();
		d[1] = new Cookie();
		d[2] = new IceCream();
		
		do{
		System.out.println("1.CUSTOMER "+ "\n2.OWNER"+"\n3.EXIT");
		choise = sc.nextInt();
		switch(choise){
			case 1 : 
				System.out.println("Place order");
				System.out.println("1.CANDY "+"\n2.COOKIE "+"\n3.ICECREAM");
				orderNO = sc.nextInt();
				
				if(orderNO == 1){
					DessertItem candy = new Candy();
					System.out.println("Enter Quantity if CANDY");
					customerQuantity = sc.nextInt();
					if(customerQuantity > Candy.quantity)
							System.out.println("OUT OF ORDER");
						
					else{
						Candy.quantity = Candy.quantity - customerQuantity;
						
					}
				}
				
				/*if(orderNO == 2){
					dessertItem = new Cookie();
					System.out.println(" PRICE : " + dessertItem.getCost() + "TAX : ");
					System.out.println(" TOTAL PRICE : " + (dessertItem.getCost()));
				}
				
				if(orderNO == 3){
					dessertItem = new IceCream();
					System.out.println(" PRICE : " + dessertItem.getCost() + "TAX : ");
					System.out.println(" TOTAL PRICE : " + (dessertItem.getCost() ));
				}
				*/
				
				break;
			case 2 : 
					System.out.println("Enter Items to Shop ");
					System.out.println("1.CANDY "+"\n2.COOKIE "+"\n3.ICECREAM");
					ownerChoise = sc.nextInt();
					if(ownerChoise == 1){
						DessertItem candy  = new Candy();
						System.out.println("Enter Price of CANDY ");
						candy.price = sc.nextInt();
						
						System.out.println("Enter tax of CANDY ");
						candy.tax = sc.nextInt();
						
						System.out.println("Enter quantity of CANDY ");
						Candy.quantity = sc.nextInt();
						
						obj.add(candy);

					}
					
					if(ownerChoise == 2){
						DessertItem cookie  = new Cookie();
						System.out.println("Enter Price of COOKIE ");
						cookie.price = sc.nextInt();
						
						System.out.println("Enter tax of COOKIE ");
						cookie.tax = sc.nextInt();
						
						System.out.println("Enter quantity of COOKIE ");
						Cookie.quantity = sc.nextInt();
						
						obj.add(cookie);

					}
					
					if(ownerChoise == 3){
						DessertItem icecream  = new IceCream();
						System.out.println("Enter Price of ICECREAM ");
						icecream.price = sc.nextInt();
						
						System.out.println("Enter tax of ICECREAM ");
						icecream.tax = sc.nextInt();
						
						System.out.println("Enter quantity of ICECREAM ");
						IceCream.quantity = sc.nextInt();
						
						obj.add(icecream);

					}

					break;
			}
		}while(choise != 3);
	}
}


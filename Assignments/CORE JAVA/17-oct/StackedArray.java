import java.util.Scanner;

class StackedArray{
	static int MAX_SIZE = 5;
	static int top = -1;
	private static int arr[] = new int[5];
	public void push(int pushValue){
		StackedArray.top++;
		if(StackedArray.top == MAX_SIZE )
			System.out.println("STACK FULLs");
		else{
			StackedArray.arr[StackedArray.top] = pushValue;
 		}
	}
	
	public void pop(){
		StackedArray.top--;
		if(StackedArray.top == -1 )
			System.out.println("STACK EMPTY");
		else{
			System.out.println("valur POP....");
 		}
		
	}
	
	public void print(){
		System.out.println("STACK valuess....");
		for (int i=0;i<StackedArray.top;i++){
			
			System.out.println(StackedArray.arr[i]);
		}
	}
	
	
	public static void main(String args[]){
		
		StackedArray myStack = new StackedArray();
		
		int pushValue,choise;
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.println("enter OPERATION you want to perform");
		System.out.println("1.PUSH "+"\n2.POP"+"\n3.PRINT"+"\n4.EXIT");
		choise = sc.nextInt();
		switch(choise){
			case 1:
				System.out.println("Enter value you want to PUSH");
				pushValue = sc.nextInt();
				myStack.push( pushValue);
				break;
			case 2 :
				myStack.pop();
				break;
			case 3 : 
				myStack.print();
		}
		}while(choise!=4);
		
		
	}
}
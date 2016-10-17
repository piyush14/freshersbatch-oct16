import java.util.Scanner;

class QueuedArray{
	private static final int MAX_SIZE = 5;
	int arr[] = new int[MAX_SIZE];
	int size = 0;
	int top = -1;
	int rear = 0;

	public void push(int pushedElement) {
		if (top < MAX_SIZE - 1) {
			top++;
			arr[top] = pushedElement;
			System.out.println("PUSHED...!!!");
			display();
		} 
		else {
			System.out.println("OVERFLOW !");
		}

	}

	public void pop() {
		if (top >= rear) {
			rear++;
			System.out.println("Pop operation done !");
			display();
		} 
		else {
			System.out.println("Queue  UNDERFLOW !");
		}
	}

	public void display() {
	if (top >= rear) {
		System.out.println("Elements  : ");
		for (int i = rear; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
 }

 public static void main(String[] args) {
	QueuedArray queuedarray = new QueuedArray();
	queuedarray.pop();
	queuedarray.push(10);
	queuedarray.push(20);
	queuedarray.push(30);
	queuedarray.push(40);
	queuedarray.pop();
	queuedarray.pop();
	queuedarray.pop();
	queuedarray.pop();
 }
}
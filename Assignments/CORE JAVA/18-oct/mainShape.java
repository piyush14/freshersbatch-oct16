abstract class Shape{
	abstract void draw();
}


class Line extends Shape{
	void draw(){
		System.out.println("DRAW LINE");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("DRAW RECTANGLE");
	}
}

class Cube extends Shape{
	void draw(){
		System.out.println("DRAW CUBE");
	}
}


public class mainShape{
	public static void main(String args[]){
		Shape s[] = new Shape[3];
		
		s[0] = new Line();
		s[1] = new Rectangle();
		s[2] = new Cube();
		
		for(int i=0 ; i < s.length ; i++)
			s[i].draw();
	}
}

public class Shape {
	void draw()
	{System.out.println("to draw the shapes");}  
	}  
	class Rectangle extends Shape{  
	void draw()
	{System.out.println("draw a rectangle");}  
	}  
	class Circle extends Shape{  
	void draw()
	{System.out.println("draw a circle");}  
	}  
	class Triangle extends Shape{  
	void draw()
	{System.out.println("draw a  triangle");}  
	}  
	class TestPolymorphism{  
	public static void main(String args[]){  
	Shape s;  
	s=new Rectangle();  
	s.draw();  
	s=new Circle();  
	s.draw();  
	s=new Triangle();  
	s.draw();  
	}  
}

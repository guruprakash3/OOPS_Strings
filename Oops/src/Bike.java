abstract class Bike{  
  abstract void move();  
}  
class Bajaj extends Bike{  
void move()
{
	System.out.println("Bike is moving smoothly");
	}  
public static void main(String args[]){  
 Bike obj = new Bajaj();  
 obj.move();  
}  
} 
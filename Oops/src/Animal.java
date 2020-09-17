
public class Animal {
	void walk()
	{
		System.out.println("walking");
		}  
	}  
	class Dog extends Animal{  
	void sniff()
	{
		System.out.println("Dog is sniffing");
		}  
	}  
	class TestInheritance{  
	public static void main(String args[]){  
	Dog d=new Dog();  
	d.walk();  
	d.sniff();  
	}
}

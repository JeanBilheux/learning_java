// Java program to demonstrate Polymorphism 

// This class will contain 
// 3 methods with same name, 
// yet the program will 
// compile & run successfully 
public class Polymorphism { 

	// Overloaded sum(). 
	// This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		System.out.println("method 1");
		return (x + y); 
	} 

	// Overloaded sum(). 
	// This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		System.out.println("method 2");
		return (x + y + z); 
	} 

	// Overloaded sum(). 
	// This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		System.out.println("method 3");
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Polymorphism s = new Polymorphism(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 

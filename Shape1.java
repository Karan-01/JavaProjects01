public class Shape1 {
	public void print_shape()
	{
		System.out.println("This is a shape");
	}
}
//Rectangle class is inheriting property of Shape class
 class Rectangle1 extends Shape1
{
	public void print_rec()
	{
		
		System.out.println("This is a rectangle");
	}
}
//Circle class is inheriting property of Shape class
 class Circle extends Shape1
 {
	 public void print_circle()
	 {
		 
	 }
 }
//Square class is inheriting property of Rectangle class
 class Square1 extends Rectangle1
{
	public void print_square()
	{
		
		System.out.println("Square is a rectangle");
	}
}

public class Demo {
	public static void main (String args[])
	{
		Square1 squ = new Square1(); // creating object of Square class
		squ.print_shape(); // Object of Square class calling function of Shape class
		squ.print_rec();// Object of Square class calling function of Rectangle class
	}
}
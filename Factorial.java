//@ author Karan //
import java.util.*;
public class Factorial 
{
	void display()
	{
	int fact=1;
	System.out.println("Enter the no. to find the factorial: ");
	// create an object of scanner
	Scanner sc=new Scanner(System.in);
	// take the input
	int num=sc.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of "+num+" is: "+fact);
	}
	public static void main(String args[])
	{
		// create object of class
		Factorial f=new Factorial();
		// calling method
		f.display();
	}
}
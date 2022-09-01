import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int i=1,fact=1;
		do {
			fact=fact*i;
			i++;	
		}
		while(i<=num);
			System.out.println("Factorial of a number is: "+ fact);	
	}

}

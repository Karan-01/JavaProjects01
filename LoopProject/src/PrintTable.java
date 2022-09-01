import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its table: ");
		int num= sc.nextInt();
		// using for loop for printing the table of a number entered by the user
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"=" + num*i);
		}
	}

}

//@ author Karan //
import java.util.*;
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// create an object of Scanner
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string:");

	    // take the input
	    String input = sc.nextLine();
	    System.out.println("Before removing whitespace of the  String: " + input);

	    // remove white spaces
	    input = input.replaceAll("\s", "");
	    System.out.println("After removing whitespace of the String: " + input);
	    sc.close();

	}

}
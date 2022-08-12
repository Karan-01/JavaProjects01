import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class ArrayElement{
	void display() {
		// create an ArrayList from the array
	    // using asList() method of the Arrays class
	    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 2, 4, 1, 2));
	    System.out.println("ArrayList with duplicate elements: " + numbers);

	    // convert the ArrayList into a set
	    Set<Integer> set = new LinkedHashSet<>();
	    set.addAll(numbers);

	    // delete all elements of ArrayList
	    numbers.clear();

	    // add element from set to ArrayList
	    numbers.addAll(set);
	    System.out.println("ArrayList without duplicate elements: " + numbers);

	}

}
public class DuplicateElement {
		public static void main(String[] args) {
		//create object of class
		ArrayElement ae=new ArrayElement();
		//calling method
		ae.display();
	}

}
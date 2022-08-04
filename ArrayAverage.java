
public class ArrayAverage {

	public static void main(String[] args) {
		int[] array= new int[] {5,10,15,20,25,35};
		int sum= 0;
		
		// Calculate sum of all array elements
		for(int i=0;i<array.length;i++) 
		sum += array[i];
		
		// Calculate average value
		double avg= sum/array.length;
		System.out.println("The average value of array is "+ avg);
	}
}

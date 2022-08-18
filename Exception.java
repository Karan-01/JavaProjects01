 
/*
 * Create a method int sum(int[] values, int start,int end) that throws an IllegalArgumentExceptionwhen passed an array of length 0, a NullPointerException
when passed a null, andArrayIndexOutOfBoundsException when start andend do not fall within the range of the given array. It should return
the sum of the values in the array from start to end but must
throw Exception when sum is 0.

 */
import java.lang.*;
import java.util.*;
public class Exception {
	int sum(int[] values) {
		int i,sum=0;
		int arrLenght=values.length;
		try {
			if(values.length==0) throw new IllegalArgumentException();
			
		}catch(IllegalArgumentException e) {
			System.out.println("Oops! Inllegal Argument");
			return 0;
		}
		try {
			for(i=0;i<arrLenght;i++) {
				sum+=values[i];
			}
			
		}catch(NullPointerException e) {
			System.out.println("Oops! The array is null");
			return 0;
		}
		
		
		for(i=0;i<arrLenght;i++) {
			sum+=values[i];
		}
	
		return sum;
	}
	public static void main(String args[]) {
		int []arr= {1,4,3,2};
		Exception obj= new Exception();
		obj.sum(arr);
		
	}

}


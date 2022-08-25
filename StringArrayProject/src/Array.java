import java.util.Arrays;
public class Array {	
	public static void main(String[] args)
	   // The Main Method is here	
	{  // Names of Array
		String[] str= { "Peter","Amy","John","Boyd","Cathy"};
		// Values of Array
	    int[] arr= { 15,9,14,10,12};
			Arrays.sort(str);
			Arrays.sort(arr);
			System.out.println("Name    Values");
					
			// print the string and number of values after sorting
			for(int i=0; i<arr.length|| i< str.length;i++)
			{		
				System.out.println(str[i]+"      "+arr[i]);
				
			}	
	  }
}
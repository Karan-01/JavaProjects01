import java.util.Scanner;

public class CountCharacters    
{    
    public static void main(String[] args) { 
    	// taking input from the user
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str= sc.nextLine();    
        int count = 0;    
            
        //Counts number of characters in a string entered by user excluding space.
        for(int i = 0; i < str.length(); i++) {   
        	//checks if there is a space or not
            if(str.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("The total no. of characters in a string: " + count);    
    }    
}     
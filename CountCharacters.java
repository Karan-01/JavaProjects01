public class CountCharacters    
{    
    public static void main(String[] args) {    
        String str = "My name is Karan";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("The total no. of characters in a string: " + count);    
    }    
}     
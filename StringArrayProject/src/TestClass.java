public class TestClass{
public static void FindResult(String input) {
	if(input.length()<4) {
		System.out.println(input);
		return;
	}
	String res="";
	int i=0;
	for(i=0;i<input.length()-4;i++) {
		res+="X";
	}
	for(i=input.length()-4;i<input.length();i++) {
		res+= input.charAt(i);
	}
	System.out.println(res);
	
}

	public static void main(String[]args) {
		String input="12345678";
		 FindResult(input);
	}
}

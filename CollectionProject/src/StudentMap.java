/*
3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.
 */

import java.util.HashMap;
import java.util.Set;
public class StudentMap 
{
	//The main method
	public static void main(String args[]) 
	{
		//Creating object of HashMap
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(101,"Karan");
		hm.put(102,"Akash");
		hm.put(103,"Prince");
		hm.put(104,"Mansih");
		hm.put(105,"jatin");
		Set<Integer> keys=hm.keySet();
	
		for(Integer stu:keys)
		{
			//Condition to print the name of student whose id is greater 103
			if(stu.intValue()>103)
			{
				System.out.println(hm.get(stu));
			}
		}
		
	}
}
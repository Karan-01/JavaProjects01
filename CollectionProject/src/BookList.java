/*
 1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class BookList  
{
	public static void main(String args[])
	{
		ContainsList();
	}	
	public static void ContainsList()
	{
       ArrayList list1=new ArrayList();
        //First array list object
		Book b1=new Book(101,"The India Story","Bimal Jalal");
		Book b2=new Book(102,"Listen to Your Heart: The London Adventure","	Ruskin Bond");
		Book b3=new Book(103,"Business of Sports: The Winning Formula for Success","Vinit Karnik");
		
		ArrayList list2=new ArrayList();
		//Second array list object
		Book b4=new Book(104,"A Place Called Home","Preeti Shenoy");
		Book b5=new Book(105,"C# in Depth ","Jon Skeet");
		Book b6=new Book(106,"Eloquent JavaScript","Marijn Haverbeke");
		
		list1.add(b1);
		list1.add(b2);
		list1.add(b3);
		
		list2.add(b4);
		list2.add(b5);
		list2.add(b6);
		//To print first array list
		System.out.println("List1 containing objects "+"\n");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("Array list1 : "+it.next());
		}
		System.out.println("\n");
		//To print second array list
		System.out.println("List2 containing objects "+"\n");
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
		System.out.println("Array list2 : "+it2.next());
		}
	}
}
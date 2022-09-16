/*
 2. Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of Treeset.
 */

import java.util.ArrayList;
import java.util.TreeSet;
public class BookTree 
{
	public static void main(String args[]) 
	{
	 //First array list object
	 ArrayList<Book> list1=new ArrayList<Book>();
	 Book bt1=new Book(101,"Meditation and Its Methods","Swami Vivekananda");
	 Book bt2=new Book(102,"Effective Java","Joshua Bloch");
	 Book bt3=new Book(103,"C# in Depth ","Jon Skeet");
     
	 list1.add(bt1);
	 list1.add(bt2);
	 list1.add(bt3);
	 //Second array list object
	 ArrayList<Book> list2=new ArrayList<Book>();
	 Book bt4=new Book(104,"Fluent Python","Luciano Ramalho");
	 Book bt5=new Book(105,"Head First Ruby","Jay McGavren");
	 Book bt6=new Book(106,"Eloquent JavaScript","Marijn Haverbeke");
	 
	 list2.add(bt4);
	 list2.add(bt5);
	 list2.add(bt6);
	 //TreeSet object
	 TreeSet<Book> ts=new TreeSet<Book>();
	 
	 ts.addAll(list1);
	 ts.addAll(list2);
	
	 for(Book bt:ts)
	 {
		 System.out.println(bt);
	 }
	}
}
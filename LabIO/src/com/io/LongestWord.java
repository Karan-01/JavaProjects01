/* Author @Karan Sharma*/
/*
 LongestWord.java
    Write a Java program to find the longest word in a text file.
 */

package com.io;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongestWord {
	public static void main(String[] args)
	{
		LongWord();
	}
	public static void LongWord()
	{
		File f=new File("C:\\Users\\Karan Sharma\\Desktop\\javaprogram\\karan1.txt");
		try {
			String str="";
			String str1;
			
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
			str1=sc.next();
				if(str1.length()>str.length())
				{
					str=str1;
				}
			}
			System.out.println(str);
		}
		catch (FileNotFoundException e) 
		{
				e.printStackTrace();
		}
	}
}
/* author @ Karan Sharma*/

/*  
      ReadFile.java
      Write a java program to read a file line by line and store it into a variable.
 */

package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		String strData = "";
		try
		{
			 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Karan Sharma\\Desktop\\javaprogram\\karan1.txt"));
			 while(strLine != null)
			 {
				 strData += strLine;
				 strLine = br.readLine();
			 }
			 System.out.println(strData);
			 br.close();
		}catch(FileNotFoundException e)
		{
			 System.out.println("File not found");
		}catch(IOException ie)
		{
			 System.out.println("Not able to read the file.");
		}
	}

}

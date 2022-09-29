/* author @ Karan Sharma*/
/*
    AppendFile.java
   Write a Java program to append text to an existing file. 
 */

package com.io;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	import java.io.FileWriter;
	public class AppendFile {
	     public static void main(String a[]){
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try
	          {
	             String filename= "C:\\Users\\Karan Sharma\\Desktop\\javaprogram\\karan1.txt";
	             FileWriter fw = new FileWriter(filename,true); 
	             //appends the string to the file
	             fw.write("Java IO Stream LabTest\n");
	             fw.close();
	             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Karan Sharma\\Desktop\\javaprogram\\karan1.txt"));
	             //read the file content
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                strLine = br.readLine();
	                System.out.println(strLine);
	             }
	             br.close();
	           }
	           catch(IOException ie)
	           {
	            System.out.println("IOException: " + ie.getMessage());
	           }
	        }
	  }
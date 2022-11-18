package com.springhibernate.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Entity.User;
import com.springhibernate.UserDao.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDao udao = (UserDao) ac.getBean("urs_dao");
		char a='s';
        while (a=='s')
		 {
			System.out.println("Enter 1 to insert the user detail: ");
			System.out.println("Enter 2 to update the user details: ");
			System.out.println("Enter 3 to delete the user details: ");
			System.out.println("Enter 4 to see specific user details: ");
			System.out.println("Enter 5 to display the user details: ");
			System.out.println("Enter 6 to exit:");	
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose any option which you want :\n");
			int i = sc.nextInt();//take value from the user
			//switch cases
			switch (i) {
			// for inserting user details
			case 1: {
				User u = new User();
				System.out.println("insert user_id:");
				int u1 = sc.nextInt();
				u.setUser_id(u1);
				System.out.println("insert user_name:");
				String us2 = sc.next();
				u.setUser_name(us2);
				System.out.println("insert user_password:");
				String us3 = sc.next();
				u.setUser_password(us3);
				
				int i1 = udao.insertUser(u);
				if (i1 == 1)
					System.out.println("Inserted user details successfully....");
				else
					System.out.println("Not inserted user details successfully...");
				break;
			}
			// for updating user details
			case 2: {
				User u1 = new User();
				System.out.println("enter id to update the detail of user...");
				int us1 = sc.nextInt();
				u1.setUser_id(us1);
				System.out.println("enter user new name to update...");
				String us2 = sc.next();
				u1.setUser_name(us2);
				System.out.println("enter user new password to update...");
				String us3 = sc.next();
				u1.setUser_password(us3);
				
		    	String us4 = sc.next();
				int i2 = udao.updateUser(u1);
				if (i2 == 1)
					System.out.println("Inserted user details successfully...");
				else
					System.out.println("problem occured while inserting user details...");
				break;
			}
			// for deleting user details
			case 3: {
				User u2 = new User();
				System.out.println("enter the user_id you want to delete :");
				int us1 = sc.nextInt();
				u2.setUser_id(us1);
				int i3 = udao.deleteUser(u2);
				if (i3 == 1)
					System.out.println("Deleted user details successfully...");
				else
					System.out.println("problem occured while deleting user details...");
				break;

			}
			// for retrieving specific user details
			case 4: {
				System.out.println("enter user_id to get specific user detail: ");
				int uid=sc.nextInt();
				User ug=udao.getUser(uid);
				System.out.println("The details of the user are : ");
				System.out.println(ug);
				break;
			}
			// for displaying all user details
			case 5: {
				User u3 = new User();
				System.out.println("displaying all users details...");

				List<User> list = udao.getAllUsers();
				System.out.println("\n" + list + "\n");
				break;
			}
			// for creating a door to exit 
			case 6:{
				System.out.println("Thanks for using User Management System!!");
				a='n';
				break;
			}
		default:
		{
			System.out.println("please choose a valid option.....");
			
		}
		}
   }}}

package input_output;

import java.util.Scanner;

public class Basicclass 
{
	
	public static void main(String[] args) 
	{
		String name;
		String age;
		String degree;
		String branch;
		String contactNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter your age");
		age=sc.nextLine();
		System.out.println("Enter your Degree");
		degree=sc.nextLine();
		System.out.println("Enter your Branch");
		branch=sc.nextLine();
		System.out.println("Enter your Contact No");
		contactNumber=sc.nextLine();
	
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Degree :"+degree);
		System.out.println("Branch :"+branch);
		System.out.println("Contact no :"+contactNumber);		
	}
}

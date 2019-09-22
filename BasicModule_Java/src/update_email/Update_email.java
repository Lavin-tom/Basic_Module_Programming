package update_email;

import java.util.Scanner;

public class Update_email {

	public static void main(String[] args) 
	{
		String name;
		String address;
		String ContactNumber;
		String email;
		String proof;
		String proofid;
		String cont;
		String update;
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your address");
		address=s.nextLine();
		System.out.println("Contact Number");
		ContactNumber=s.nextLine();
		System.out.println("E-Mail ID");
		email=s.nextLine();
		System.out.println("Enter proof type");
		proof=s.nextLine();
		System.out.println("Enter proof id");
		proofid=s.nextLine();
		count++;
		System.out.println("Thank you for registering. Your id is "+count);
		System.out.println("Do you want to continue registration (y/n)?");
		cont=s.nextLine();
		System.out.println("Do you want to update the email id?(yes/no)");
		update=s.nextLine();
		if(  (update.equals("YES") )    ||  (update.equals("yes") ) )
		{
			System.out.println("Update Email:");
			System.out.println("Enter new Email id");
			email=s.nextLine();
			System.out.println("Email updated");
		}
		System.out.println("Your details are as follows");
		System.out.println("Name:"+name);
		System.out.println("Address: "+address);
		System.out.println("Contact Number: "+ContactNumber);
		System.out.println("E-Mail ID: "+email);
		System.out.println("proof type: "+proof);
		System.out.println("proof id: "+proofid);
			
	}

}

package case_study4;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args)
	{
		String name;
		String address;
		String ContactNumber;
		String email;
		String proof;
		String proofid;
		String cont;
		int customer[];
		String customername[];
		customer = new int[20];
		customername=new String[20];
		for(int b=0;b<10;b++)
		{
			customer[b]=0;
		}
		int count=0,i=0,j=0,k=0;
		
		Scanner s = new Scanner(System.in);
		for(i=1;i<10;i++)
		{
		System.out.println("Registration");
		System.out.println("Enter your name");
		name=s.nextLine();
		customername[i]=name;
		
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
		customer[i]=i;
		//j++;
		System.out.println("Do you want to continue registration (y/n)?");
		cont=s.nextLine();
		if(  (cont.equals("Y") )    ||  (cont.equals("y") ) )
		{
		}
		else
		{
		System.out.println("Customers list");
		System.out.println("The registered customers are ");
		System.out.println("customer ID       Customer name ");
		for(int n=1;n<10;n++)
		{
			if(customer[n]!=0)
			{
		
		System.out.print(customer[n]);
		System.out.print("                   ");
		System.out.print(customername[n]);
		System.out.println("");
		
			}
	}
		System.out.println("Thank You");
		i=10;
}
}
	}
}
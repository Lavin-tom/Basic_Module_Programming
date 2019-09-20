package hotel_booking;

import java.util.Scanner;

public class Hotel_booking {

	public static void main(String[] args) 
	{
		int choice;
		int count=0;
		int room;
		int booked[]=new int[26];
		int m=1;
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String proceed;

		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<25;i++)
		{
		System.out.println("Menu");
		System.out.println("1.Book");
		System.out.println("2.Check status");
		System.out.println("3.Exit");
		System.out.println("Enter your choice ");
		choice=s.nextInt();
		s.nextLine();
		if(choice==1)
		{
			System.out.println("Booking ");
			System.out.println("Please choose the service required ");
			
			System.out.println("AC/non-AC(AC/nAC)");
			ac=s.nextLine();
			
			System.out.println("Cot(Single/Double)");
			cot=s.nextLine();
			
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=s.nextLine();
			
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=s.nextLine();
			
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=s.nextLine();
			
			System.out.println("The services chosen are");
			
			    if((ac.equals("AC")||(ac.equals("ac"))) && ((cot.equals("Single"))||(cot.equals("single"))) && (cable.equals("C")||cable.equals("c")) && (wifi.equals("W")||wifi.equals("w")) && (laundry.equals("L")||laundry.equals("l")))
			    		System.out.println("The total charge is Rs.1350");
			    if((ac.equals("AC")||(ac.equals("ac"))) && ((cot.equals("Double"))||(cot.equals("double"))) && (cable.equals("C")||cable.equals("c")) && (wifi.equals("W")||wifi.equals("w")) && (laundry.equals("L")||laundry.equals("l")))
		    		System.out.println("The total charge is Rs.1700");
			    
				System.out.println(""+cot+ "cot " +ac+ " room ");
				if(cable.equals("C")||cable.equals("c"))
				System.out.println("Cable connection enabled ");
				else
					System.out.println("cable connection not enabled ");
				
				if(wifi.equals("W")||wifi.equals("w"))
					System.out.println("Wi-Fi enabled");
				else
					System.out.println("Wi-Fi not enabled");
				
				if(laundry.equals("L")||laundry.equals("l"))
					System.out.println("with laundry service");
				else
					System.out.println("without laundry service");
				
				System.out.println("Do you want to proceed?(yes/no) ");
				proceed=s.nextLine();
				
				if(proceed.equals("YES")||proceed.equals("yes"))
				{
					booked[m]=1;
					System.out.println("Thank you for booking Your room number is:"+m);
					m=m+1;
				}
				else
					System.out.println("");
					
		}
		
		if(choice==2)
		{
			System.out.println("Check Status: ");
			System.out.println("Enter room number ");
			room=s.nextInt();
			
			if(booked[room]==1)
			
				System.out.println("Room no "+room+" is booked");
			else
				System.out.println("Room no " +room+ " is not booked ");
		}
		
		if(choice==3)
		
			System.exit(0); 
		}
		
		}	

	}


package leapyear;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) 
	{
		int num,a=1,sum=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year:");
        num = s.nextInt();
        if(num%4==0)
        {
        	if(num%100==0)
        	{
        		if(num%400==0)
        		{
        	System.out.println("It is a leap year");
        		}
        	else
        	{
        		System.out.println("It is not a leap year");
        	
	        }
        	}
        		else
        		{
        			System.out.println("It is a leap year");
        		}
        }
        	else
        		{
        			System.out.println("It is not a leap year");
        		}
	}
	}
        			
        	

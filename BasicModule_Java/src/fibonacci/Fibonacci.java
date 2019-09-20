package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		        int num, t1 = 0, t2 = 1,sum=0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the no :");
		        
		        num = s.nextInt();
		        System.out.print(""+t1);
		        for (int i = 0; i <= num; ++i)
		        {
		           
		             sum = t1 + t2;
		            t1 = t2;
		            t2 = sum;
		            System.out.println(" "+sum);
		        }
	}}

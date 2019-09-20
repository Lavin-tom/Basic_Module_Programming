package average;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
		{
			int num,sum=0,avg;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of students:");
	        num = s.nextInt();
	        int a[] = new int[num],temp;
	        System.out.println("Enter the marks students:");
	        for (int i = 0; i < num; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        for(int j=0;j<num;j++)
	        {
	        	sum=sum+a[j];
	        }
	        avg=sum/num;
	        System.out.println("The Average is :"+avg);
	}

}

package mark;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) 
		{
			int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of students:");
	        num = s.nextInt();
	        int a[] = new int[num],temp;
	        System.out.println("Enter the marks students:");
	        for (int i = 0; i < num; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        for (int i = 0; i < num; i++) 
	        {
	            for (int j = i + 1; j < num; j++) 
	            {
	                if (a[i] < a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.print("The priority of marks is:");
	        for (int i = 0; i < num ; i++) 
	        {
	            System.out.println(a[i]);
	        }
	        //System.out.print(a[num - 1]);
	    }

	}


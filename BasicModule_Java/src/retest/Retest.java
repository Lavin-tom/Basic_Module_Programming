package retest;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) {
		int num,count=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of students:");
        num = s.nextInt();
        int a[] = new int[num],temp;
        System.out.println("Enter the marks of students:");
        for (int i = 0; i < num; i++) 
        
            a[i] = s.nextInt();
        
        for(int j=0;j<num;j++)
        {
        	if(a[j]<=50)
        		count++;
        }
        System.out.println("Number of students appearing for retest is :"+count);
	}

}
//7220654189
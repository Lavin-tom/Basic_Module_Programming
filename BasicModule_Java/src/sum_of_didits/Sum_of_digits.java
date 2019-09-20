package sum_of_didits;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		int num,a=1,sum=0;
        Scanner s = new Scanner(System.in);
       
        
        System.out.print("Enter the number  :");
        num = s.nextInt();
        if(num<0)
        {
        	System.out.print("Enter the number  :");
            num = s.nextInt();
        for (int i = 1; i <= num; i++) 
        sum=sum+i;
        System.out.println("The sum is  :"+sum);
        }
	}

}

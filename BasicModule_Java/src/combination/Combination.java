package combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args)
	{
		int num,a=1,sum=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number alphabets in your name :");
        num = s.nextInt();
        
        for (int i = 1; i <= num; i++) 
        sum=sum*i;
        System.out.println("The number of combination is :"+sum);

	}

}

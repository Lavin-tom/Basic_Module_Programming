package max_element;

import java.util.Scanner;

public class Max_element {

	public static void main(String[] args) 
	{
		int num,temp,i,j,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of element:");
        num = s.nextInt();
        
    
        System.out.print("Enter the elements:");
        int a[] = new int[num];
        for (i = 0; i < num; i++) 
        {
            a[i] = s.nextInt();
        }
        for (i = 0; i < num; i++) 
        {
            for (j = i + 1; j < num; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(""+a[num-1]);
  
	}

}

package least_array_index;

import java.util.Scanner;

public class Max_elements {

	public static void main(String[] args) 
	{
		int num,b=0,c=0,min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of element:");
        num = s.nextInt();
        
    
        System.out.print("Enter the elements:");
        int a[] = new int[num];
        for (int i = 0; i < num; i++) 
        {
            a[i] = s.nextInt();
        }
        min=a[0];
        for(int i=0;i<num;i++)
        {
        	if(a[i]<min)
        	{
        		min=a[i];
        		b=i+1;
        		c=1;
        	}
        }
        if(c==1)
        
        	System.out.print(+b);
        
        else
        	System.out.print("1");
     
        //System.out.print(""+a[num-1]);
}
  
	}


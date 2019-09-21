package faul_throw;

import java.util.Scanner;

public class Faul_throw {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	      int a,n,b,c;
	      int T=0;
	      Scanner s=new Scanner(System.in);
	      a=s.nextInt();
	      n=a/10;
	      b=a%10;
	      c=b;
	      if(a<10 || a>19)
	      {
	     
	      switch(b)
	      {
	      case 1:
	      case 2:
	      case 6:T=T+3;
	      break;
	     case 4:
	     case 5:
	     case 9: T=T+4;
	     break;
	      }
	      switch(n)
	      {
	      case 2:
	      case 3:
	      case 4:
	      case 8:T=T+6;
	      break;
	      case 5:
	      case 6: T=T+5;
	      break;
	      case 7:
	      case 9: T=T+7;
	      break;
	      }
	      System.out.println("a:" +T);
	}

	else
	{
	switch(c)
	{
	case 1:
	case 2: T=T+6;
	break;
	case 5:
	case 6:T=T+7;
	break;
	case 3:
	case 4:
	case 7:
	case 8:T=T+8;
	break;
	case 9:T=T+9;
	break;

	}
	System.out.println("a:" +T);

	}
	}}
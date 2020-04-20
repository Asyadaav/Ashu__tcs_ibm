package test;
import java.util.*;
public class Binary_to_Decimal1
/*
{
        public static void main(String args[])
           {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the binary number");
	        int binary=sc.nextInt();
	        double decimal=0;
	        int power=0;
	        int temp;
	            while(true)
	            {
	        	  if(binary==0)
	        	  {
	        		 break;
	        	  }
	        	  else
	        	  {
	        		  temp=binary%10;
	        		  decimal=decimal+temp*Math.pow(2, power);
	        		  power++;
	        		  binary=binary/10;
	        	  }
	            }
	         System.out.println("the decimal of given binary numbe is"+decimal);
           }
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a binary number");
		int binary=sc.nextInt();
		int temp;
		
		double decimal=0;
		int power=0;
		if(binary==0)
		{
			System.out.println("0");
		}
		else
		{
			while(binary!=0)
			{
				temp=binary%10;
				decimal=decimal+temp*Math.pow(2, power);
				power++;
				binary=binary/10;
				
			}
		System.out.println("decimal number is"+decimal);	
		}
		
		
		
}
}
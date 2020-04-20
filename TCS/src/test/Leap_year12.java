package test;
import java.util.*;
public class Leap_year12 /*
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number you want to check");
int year=sc.nextInt(); 


if(year%4==0)
{
	          if(year%100==0)
	           {
		                   if(year%400==0)
		                   {
		                	  System.out.println("leap year"); 
		                   }
		                   else
		                   {
		                	   System.out.println("not a leap year");
		                   }
             	}
	           else
	           {
		       System.out.println("leap year");
	           }
}
else
{
System.out.println("year is not leap year");	
}
}

}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year for check a leap year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			               if(year%100==0)
			               {
			            	           if(year%400==0)
			            	           {
			            	        	   System.out.println("given year is leap year");
			            	           }
			            	           else
			            	           {
			            	        	   System.out.println("given year is not leap year ");
			            	           }     
			               }
			               else
			               {
			            	   System.out.println("given year is a leap year");
			               }
		}
		else
		{
			System.out.println("given year is not leap year");
		}
	}
		
}
package test;
import java.io.*;
import java.util.*;
public class Prime_no
/*
{
public static void main(String args[])
{   int temp=0;
    int prime;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number for check a prime number");
	int num =sc.nextInt();
	                 if(num==1)
                 	{
	                    	System.out.println("enter number is not prime number");
	                    	
	                  }

	
	             else {
	             for(int i=2;i>=num-1;i++)	{
		         
	                 	if(num%i==0)
		                       {
			                        temp=temp+1;
	                           	}
	                 	
	               
	                }
	                 }
	
		               if(temp==0) {
		                    	System.out.println(" prime number");
		               }
		 else
		{
			System.out.println(("not prime number"));
		}
	}
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=0;
		
		if(num==1)
		{
			System.out.println("enter number is not a prime number");
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					temp++;
				}
			}
		}
		
		
		    if(temp==0)
		    {
		    	System.out.println("prime number");
		    }
		    else
		    {
		    	System.out.println("not prime number");
		    }
	}
	}
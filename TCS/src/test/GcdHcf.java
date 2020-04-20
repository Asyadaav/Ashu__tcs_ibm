package test;
import java.io.*;
import java.util.*;
public class GcdHcf 
{
	/*
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number for hcf");
		int num1=sc.nextInt();
		System.out.println("enter second number for gcd");
		int num2=sc.nextInt();
		System.out.println("the hcf of given number is"+gcd(num1,num2));
	}
static int gcd(int n1,int n2)
{
	       if(n1==0 || n2==0)
	       {
	    	   return 0;
	       }
	       if(n1==n2)
	       {
	    	   return n1;
	       }
	       if(n1>n2)
	       {
	    	   return gcd(n1-n2,n2);
	       }
	       else
	       {
	    	   return gcd(n2-n1,n2);
	       }
}
	
	
*/


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a first number");
	int num1=sc.nextInt();
	System.out.println("enter a second number ");
	int num2=sc.nextInt();
	int temp;
	if(num1<num2)
	{
		temp=num1;
		num2=num1;
		num2=num1;
	}
	
	System.out.println("gcd of given number is"+gcd(num1,num2));

	
}
static int gcd(int num1,int num2)
{
	if(num1==0 || num2==0)
	{
		return 0;
	}
	else if(num1==num2)
	{
		return num1;
	}
	else if(num1>num2)
	{
		return gcd(num1- num2,num2);
	}
	else
	{
		return gcd(num2-num1,num2);
	}
}
}

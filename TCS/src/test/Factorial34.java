package test;
import java.io.*;
import java.util.Scanner;
public class Factorial34 
/*
{
public static void main(String args[]) {
	System.out.println("enter a number for factorial");
	Scanner sc=new Scanner(System.in);
	int i,n = 0,factorial=1;
	int num=sc.nextInt();
	
	System.out.println(+num);
	for(i=num;i>=1;i--)
	{
		factorial=factorial*i;


	}
	System.out.println("factorial of given number is "+factorial);
}
}
*/
{
       public static void main(String args[])
       {
    	   System.out.println("enter a number for factorial");
    	   Scanner sc=new Scanner(System.in);
    	   int num=sc.nextInt();
    	   int mul=1;
    	        
    	         for(int i=num;i>0;i--)
    	         {
    	        	 mul=mul*i;
    	         }
    	         System.out.println(mul);
       }
}
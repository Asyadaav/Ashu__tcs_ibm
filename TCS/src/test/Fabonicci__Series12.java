package test;
import java.util.*;
public class Fabonicci__Series12
/*
{
   public static void main(String args[])
   {
	   System.out.println("enter the series length of fabonicci series");
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int a=0;
	   int b=1;
	   System.out.println(+a+"\n"+b);
	   int c;
	   for(int i = 0;i<=num;i++)
	   {
		   
		   c=a+b;
		   System.out.println(c);
		   a=b;
		   b=c;
	   }
   }
}
*/
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  a number for series");
	int num=sc.nextInt();
	int a=0;
	int b=1;
	int c;
	
	System.out.println("fabonicci series of given number");
	
	//System.out.print(" "+b);
	for(int i=0;i<num;i++)
	{
		System.out.print(" "+a);
		c=a+b;
		a=b;
		b=c;
		//System.out.print(" "+c);
	}
	}
}
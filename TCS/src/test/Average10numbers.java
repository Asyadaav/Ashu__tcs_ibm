package test;
import java.io.*;
import java.util.*;

import javax.print.attribute.Size2DSyntax;
//public class Average10numbers
/*
{
public static void main(String args[])
{   int num=0,Avg;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	for(int i=1;i>=10;i++)
	{
		a[i]=sc.nextInt();
		num=num+a[i];
	}
	Avg=num/10;
	System.out.println("the average of given number is"+Avg);
}
}
*/
public class Average10numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 10 number in array");
		int arr[]=new int[10];
		int Average=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			
			Average=Average+arr[i];
		}
		System.out.println("the sum of given number is "+Average);
		
	}
}
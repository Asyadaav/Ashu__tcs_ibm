package test;
import java.io.*;
import java.util.*;
public class Even_number
/*{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("even number");
		
	}
	else
		System.out.println("odd nimber");
	
}*/
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("given number is even number");
	}
	else
	{
		System.out.println("given number is not even number");
	}
}
}
package test;
import java.util.*;
public class Palindrome_number11 /*{
	public static void main(String args[])
	{
		System.out.println("enter a number do you want to reverse");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem;
		int rev=0;
		int num1=num;
		while(num1!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		if(num==rev)
		{
			System.out.println("the given number is Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for palindrome");
		int num=sc.nextInt();
		int temp;
		int num1=num;
		int save=0;
	while(num1!=0)
	{
		temp=num1%10;
		save=save*10+temp;
		num1=num1/10;
	}
	
		if(num==save)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
	}
}
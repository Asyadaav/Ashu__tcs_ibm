package test;
import java.util.*;
public class String_Palindrome1
/*{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string for reverse(String palindrome)");
	String str=sc.nextLine();
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println("the reverse of given string is"+reverse);
	if(str.equals(reverse))
	{
		System.out.println("given strinfg is string palindrome");
	}
	else
	{
		System.out.println("the given String is not String palindrome");
	}
}
}*/
{
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter a string for String palindrome");
		String str=sc.nextLine();
	    String str1="";
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	str1=str1+str.charAt(i);
	    }
	    System.out.println(str1);
	    if(str.equals(str1))
	    {
	    	System.out.println("String palindrome");
	    }
	    else
	    {
	    	System.out.println("not a string palindrome");
	    }*/
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string for check given string is string palindrome or not");
		String str=sc.nextLine();
		String str1="";
		str=str.toLowerCase();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str.equals(str1))
		{
			System.out.println("given string is string palindrome");
		}
		else
		{
			System.out.println("given string is not string palindrome");
		}
	}
	
}

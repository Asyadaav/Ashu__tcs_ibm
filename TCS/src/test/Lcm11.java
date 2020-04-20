package test;
import java.io.*;
import java.util.*;
public class Lcm11 /* {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two first number for lcm");
		int num1=sc.nextInt();
		System.out.println("enter second number for lcm");
		int num2=sc.nextInt();
		int lcm=0;
		lcm=num1>num2?num1:num2;
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
			{
				System.out.println("lcm of given two number is"+lcm);
				break;
			}
			++lcm;
		}
	}

}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number for lcm");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int lcm;
		lcm=num1>num2?num1:num2;
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
			{
				System.out.println("lcm of given number is "+lcm);
				break;
			}
			++lcm;
		}
	}
}
 
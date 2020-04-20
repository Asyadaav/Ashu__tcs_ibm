package test;
import java.util.*;
public class Decimal_to_Binary2 /*
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a decimal number");
	int decimal1=sc.nextInt();
	int Binary[]=new int[1000];
	int i=0;
	while(decimal1!=0)
	{
		Binary[i]=decimal1%2;
		decimal1=decimal1/2;
		i++;
		
	}
	System.out.println("binary conversion of given number is");
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(+Binary[j]);
	}
}
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a decimal number");
		int decimal=sc.nextInt();
		int binary[]=new int[100];
		int i=0;
		
		System.out.print("binary number is ");
		
		if(decimal==0)
		{
			System.out.print("000");
		}
		else
		while(decimal!=0)
		{
			int temp=decimal%2;
			binary[i]=temp;
			i++;
			decimal=decimal/2;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
	}
	
}

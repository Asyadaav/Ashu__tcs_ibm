package test;

import java.util.Scanner;

public class Armstrong11 
/*
{
public static void main(String args[])

{
	System.out.println("enter a number do you wwant to check for armstrong numnber");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int len=0;
	int t1=num;
	while(t1!=0)
	{
	t1=t1/10;
	len++;
	}
	System.out.println(+len);
  int t2=num;
  
  int i;
  int rem,Arms=0;
  
  int mod;
  while(t2!=0)
  {
	  int mul=1;
	  rem=t2%10;
	  for(i=1;i<=len;i++)
	  {
		 
		  mul=mul*rem;
	  }
	 
	  Arms=Arms+mul;
	  t2=t2/10;
	  
  }
  System.out.println(Arms);
  
  if(Arms==num)
  {
	  System.out.println("the given number is Armstrong number");
  }
  else
  {
	  System.out.println("the given number is not armstrong number");
  }
}
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number");
		int num =sc.nextInt();
		int num1=num;
		int num2=num;
		int temp;
		int len=0;
		
		     while(num1!=0)
		    {
			    temp=num1%10;
			    len++;
			    num1=num1/10;
		    }
		    System.out.println(len);
		    
		    int mod;
		    int arms=0;
		    
		    
		   while(num2!=0)
		   {
			   int mul=1;
			   mod=num2%10;
			   for(int i=0;i<len;i++)
			   {
				   mul=mul*mod;
			   }
			   arms=arms+mul;
			   num2=num2/10;
		   }
		   
		    if(arms==num)
		    {
		    	System.out.println("given number is example of armstrong number");
		    }
		    else
		    {
		    	System.out.println("given number is not a example of armstrong number");
		    }
	}
	
}
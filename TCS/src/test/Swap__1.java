package test;
import java.util.*;
public class Swap__1 {
	public static void main(String args[]) {
		
		/*swapping programing using third variable
		
		
		System.out.println("enter the number do you want to swap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("the first number is"+a);
		int b=sc.nextInt();	
		System.out.println("the second number is"+b);
	    int temp;
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("Swapping value of a"+a+" and b is "+b);
	    
	    
	    
	    */
		
		
		//Swapping programming without using third variable
		
		System.out.println("enter the number do you want to swap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("the first number is"+a);
		int b=sc.nextInt();	
		System.out.println("the second number is"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping value of a"+a+" and b is "+b);
	}

}

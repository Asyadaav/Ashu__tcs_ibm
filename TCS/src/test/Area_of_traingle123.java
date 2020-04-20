package test;
import java.util.*;
public class Area_of_traingle123 
/*

{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	float a,b,c,s;
	Double area;
	System.out.println("enter the first side if triangle");
	a=sc.nextFloat();
	System.out.println("enter the second side of triangle");
	b=sc.nextFloat();
	System.out.println("enter the third side of triangle");
	c=sc.nextFloat();
	s=(a+b+c)/2;
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("the are of traingle is "+area);
	
	
}

}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valiue of traingle of side a,b,c");
		System.out.println("a");
		int a=sc.nextInt();
		System.out.println("b");
		int b=sc.nextInt();
		System.out.println("c");
		int c=sc.nextInt();
		double s;
		double Area;
		s=(a+b+c)/2;
		Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("the area of given traingle is"+Area);
	}
}
package test;
import java.util.*;

public class String_concatenation /*{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    String middle=sc.nextLine();
    String first =sc.nextLine();
    String last=sc.nextLine();
  System.out.println("print the full name");
  String fullname=first +" "+ middle+" " + last;
  System.out.println(fullname);
}
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String first=sc.nextLine();
		System.out.println("second string");
		String second=sc.nextLine();
		System.out.println("enter the third string");
		String third=sc.nextLine();
		String full=first +" "+second+" "+third;
		System.out.println("full String is"+full);
	}
}
package test;
import java.util.Scanner;
public class Sqrt_and_Cbrt12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for sqare root");
		Double square1=sc.nextDouble();
		System.out.println("enter the second number for cube root");
		Double cube1=sc.nextDouble();
		
		Double squareroot1;
		Double cuberoot1;
		
		
		
		squareroot1=Math.sqrt(square1);
		cuberoot1=Math.cbrt(cube1);
		
		System.out.println("the square root is"+squareroot1);
		System.out.println("the cube root is"+cuberoot1);
	}

}

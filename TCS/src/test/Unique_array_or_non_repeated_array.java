package test;
import java.util.*;
public class Unique_array_or_non_repeated_array  /*
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the size of array");
    n=sc.nextInt();
    int array[]=new int[n];
   int flag = 0;
   int count=0;
    for(int i=0;i<n;i++)
    {
    	array[i]=sc.nextInt();
    }
    System.out.println("the unique/non repeated number");
                      for(int i=0;i<n;i++)
                      {
    	                      for(int j=0;j<n;j++)
    	                      {
    	                    	  if(i!=j) 
    	                    	  {
    	                	                if(array[i]!=array[j])
    	                	                 {
    	                		                flag=1;
    	                	                  }
    	                	                else
    	                	                {
    	                	                	flag=0;
    	                	                			break;
    	                	                }
    	                           }
    	                      }
    	                      if(flag==1)
    	                      {
    	                    	  count++;
    	                    	  System.out.println(array[i]);
    	                      }
                      }
}
}
*/
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int temp=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]!=arr[j])
				{
				  temp=1;
				}
				else
				{
					temp=0;
				}
			}
			if(temp==1)
			System.out.print(" "+arr[i]);
		}
		
		
		
	}
}
package sum;

import java.util.Scanner;

public class Myclass 
{
	public static void main(String arg[])
	{
		int[] data=new int[5];
		Scanner obj =new Scanner(System.in);
		int sum=0, avg;
		
		for(int i = 0;i<data.length;i++)
		{
	      System.out.println("Enter any Number");
	      data[i]=obj.nextInt();
		}
			for(int d:data)
			
		      sum+=d;
		      avg=sum/data.length;
		      System.out.println("Sum of FIvesum);
		      System.out.println(avg);
	
		
		
		
	}
}

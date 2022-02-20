package Loop;

import java.util.Scanner;

public class myloop 
{
	public static void main(String arg[])
	{
		int[] data=new int[5];
		Scanner obj =new Scanner(System.in);
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter a Number");
			data[i] = obj.nextInt();
		}


		
		for(int i=0;i<5;i++)
		{
			System.out.println(data[i]);
		}
		
			for(int d:data)
			{
				System.out.println(d);
			}
	}
}

package biggestnumber;

import java.util.Scanner;

public class number 
{
	public static void main(String arg[])
	{
		int[] data=new int[5];
		Scanner obj =new Scanner(System.in);
		
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter any Number");
			data[i] = obj.nextInt();
		}
		
		int temp=data[0];
		
		for(int d:data)
		{										
			if(d>temp)
			{
				;
			}
			
		}
		
		System.out.println("Biggest number :"+temp);

	}
}

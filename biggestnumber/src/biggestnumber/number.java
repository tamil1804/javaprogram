package biggestnumber;

import java.util.Scanner;

public class number 
{
	public static void main(String arg[])
	{
		int[] data=new int[5];
		Scanner obj =new Scanner(System.in);
		
		for(int i=0;i<data.length;i++) 
		{
			System.out.println("Enter any Number");
			data[i] = obj.nextInt();
		}
		
		int temp=data[0];
		
		for(int d=1;d<data.length;d++)
		{										
			if(data[d]>temp)
			{
				temp=data[d];
			}
			
		}
		
		System.out.println("Biggest number :"+temp);

	}
}

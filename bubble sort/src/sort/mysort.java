package sort;

import java.util.Scanner;

public class mysort
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
		int temp;
		 for(int i=0;i<data.length;i++)
		 {
			 for(int j=0;j<data.length-1;j++)
			 {
				 if(data[j]>data[j+1])
				 {
					 temp=data[j];
					 data[j]=data[j+1];
					 data[j+1]=temp;
					 
				 }
				
			 }
		 }
		   
		 for(int d:data) 
		 {
				System.out.println(d);
		 }
	}
}

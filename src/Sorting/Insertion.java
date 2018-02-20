package Sorting;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		int t,temp;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		 t=c.nextInt();
		int[]arr=new int[t];
		System.out.println("Enter the elements of array");	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c.nextInt();
			if(i!=0)
			{if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
			}
		}}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
		}
		

	}

}

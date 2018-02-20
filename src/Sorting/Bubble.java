package Sorting;
//BUBBLE SORTING
import java.util.Scanner;

public class Bubble {

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
		}
		for(int i=0;i<arr.length;i++)//Fixed value
		{
			for(int j=0;j<arr.length-1;j++)//Comparison
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		

	}

}

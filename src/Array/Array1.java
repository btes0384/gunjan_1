package Array;

import java.util.Scanner;

public class Array1 {
public static void main(String s[])
{
	int t;
	Scanner c=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	 t=c.nextInt();
	int[]arr=new int[t];
	System.out.println("Enter the elements of array");	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=c.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
	System.out.print(arr[i]);
	}
}
}

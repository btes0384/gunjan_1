package Sorting;
//SELECTION SORT
import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		{
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
				for(int j=i+1;j<arr.length;j++)//Comparison
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
			
	}

}
}
package Searching;
//BINARY SEARCHING
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int t,mid;
		int[]arr={1,2,3,4,5,6};
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		 t=c.nextInt();
		 mid=arr.length/2;
		 if(t==arr[mid])
		 {
			 System.out.println(" found at "+mid);
		 }
		 else if(t<arr[mid])
		 {
			 for(int i=0;i<mid;i++)
			 {
				 if(t==arr[i])
				 {
					 System.out.println("Found at "+i);
				 }
			 }
		 }
		 else if(t>arr[mid])
			 for(int i=mid+1;i<arr.length;i++)
			 {
				 if(t==arr[i])
				 {
					 System.out.println("Found at "+i);
				 }
			 }
		 else 
			 System.out.println("Element not found"); 
		 }
			 
	}



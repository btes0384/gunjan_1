package Searching;

import java.util.Scanner;
//LINEAR SEARCHING
public class Linear {

	public static void main(String[] args) {
		int t;
		int[]arr={1,2,3,4,5,6};
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		 t=c.nextInt();
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==t)
			 {
				 System.out.println("Element found "+i+" position ");
			 }
			 else
				 {
				 System.out.println("Element not in the array");
				 break;
				 }
				 }
			
		 }
	}



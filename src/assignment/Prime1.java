package assignment;

//To check number PRIME or Not

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		int n;
		boolean flag=true;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a no.");
		n=c.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		
		}
		if(flag==true)
			System.out.println("Number is prime");
	else
		System.out.println("Number is not prime");
		

	}

}

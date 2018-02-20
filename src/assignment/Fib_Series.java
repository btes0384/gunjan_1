package assignment;

// To Print FIBONACCI series

import java.util.Scanner;

public class Fib_Series {
	void fib(int a,int b,int c)
	{
		int sum=0;
		while(c!=0)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			c--;			
		}
		}
	

	public static void main(String[] args) {
		Fib_Series f1=new Fib_Series();
		int n;
		Scanner c= new Scanner(System.in);
		System.out.println("Enter no. of elements of series");
		n=c.nextInt();
		System.out.print("the series = 0 1 ");
		f1.fib(0,1,n-2);

	}

}

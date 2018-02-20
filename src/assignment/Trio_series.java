package assignment;

import java.util.Scanner;
//To Print TRIO series(0,1,1,2,4,7...)

public class Trio_series {
	void tri(int a,int b,int c,int d)
	{
		int sum=0;
		while(d!=0)
		{
			sum=a+b+c;
			System.out.print(sum+" ");
			a=b;
			b=c;
			c=sum;
			d--;			
		}
		}
	public static void main(String[] args) {
		Trio_series t1=new Trio_series();
		int n;
		Scanner c= new Scanner(System.in);
		System.out.println("Enter no. of elements of series");
		n=c.nextInt();
		System.out.print("the series = 0 1 1 ");
		t1.tri(0,1,1,n-3);
	}
}

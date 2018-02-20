package assignment;

//to check armstrong number

import java.util.Scanner;

public class Armstrong {
	int len(int n)
	{ 
	int count=0;
	while(n>0)
	{   //count++;
		n=n/10;
		count++;
	}
	
	return count;
	}
	
	public static void main(String[] args) {
		Armstrong l=new Armstrong();
		int n,p=0,t,y,z;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no:-");
		n=c.nextInt();
		t=n;
		z=l.len(n);
		while(n>0)
		{
		y=n%10;
		n=n/10;
		p=p+(y*y*y);
		}
		if(t==p)
		{
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not Armstrong number");

	}

	}



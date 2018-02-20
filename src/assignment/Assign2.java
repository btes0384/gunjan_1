package assignment;

//To find numbers divisible by a given no. within a given range

import java.util.Scanner;

public class Assign2 {
	int solution(int A ,int B,int K)
	{int count=0;
	int a[]=new int[B];
		for(int i=A;i<=B;i++)
	{
		if((i%K==0))
		{
			
			count++;			
		}
	}
	return count;	
	}

	public static void main(String[] args) {
		Assign2 a2=new Assign2();
		int a,b,k,v;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter  A ");
		 a=c.nextInt();		 
		 System.out.println("Enter B ");
		 b=c.nextInt();
		 System.out.println("Enter K ");
		 k=c.nextInt();
		 v=a2.solution(a, b, k);
		 System.out.println("Total numbers divisible by "+k+" between "+a+" and "+b+" :- "+v);
	}

}

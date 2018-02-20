package assignment;

//To Find Reverse of NUMBER

import java.util.Scanner;

public class Reverse {
	void rev(int n)
	{ int t,sum=0;
		System.out.println("The reverse of "+n+" :- ");
		while(n>0)
		{
			t=n%10;
			sum=(sum*10)+t;
			n=n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n;
		Reverse r=new Reverse();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no:-");
		n=c.nextInt();
		r.rev(n);
	}

}

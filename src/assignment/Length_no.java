package assignment;
 
// To Find Length of Number

import java.util.Scanner;

public class Length_no {
	void len(int n)
	{ 
	int count=0;
	while(n>0)
	{   //count++;
		n=n/10;
		count++;
	}
	System.out.println("The length of number = "+count);
	}

	public static void main(String[] args) {
		Length_no l=new Length_no();
		int n;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no:-");
		n=c.nextInt();
		l.len(n);

	}

}

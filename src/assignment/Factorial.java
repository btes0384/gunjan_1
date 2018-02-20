package assignment;

//to find factorial
import java.util.Scanner;

public class Factorial {
	void fact(int n)
	{
		int f=1;
		System.out.print("Factorial of "+n+" = ");
		for(int i=n;i>0;i--)
		{
			f=f*i;
		}
		System.out.print(f);
	}

	public static void main(String[] args) {
		Factorial y=new Factorial();
		int n;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no:- ");
		n=c.nextInt();
		y.fact(n);
	}

}

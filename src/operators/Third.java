package operators;
//Swap 2 numbers without 3rd variable
import java.util.Scanner;

public class Third {
	void swap(int a,int b)
	{
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping\n 1st = "+a+"\n2nd = "+b);
		
	}

	public static void main(String[] args) {
		int a,b;
		Third s2=new Third();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the first no.");
		a=c.nextInt();
		System.out.println("Enter the Second no.");
		b=c.nextInt();
		System.out.println("Before swapping\n 1st = "+a+"\n 2nd = "+b);
		s2.swap(a,b);
	
	}

}

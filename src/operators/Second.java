package operators;
//To swap 2 numbers using 3rd variable
import java.util.Scanner;

public class Second {
	void swap(int a,int b)
	{
		int y;
		y=a;
		a=b;
		b=y;
		System.out.println("After swapping\n 1st = "+a+"\n2nd = "+b);
		
	}
	public static void main(String[] args) {
		Second s1=new Second();
		int a,b;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the first no.");
		a=c.nextInt();
		System.out.println("Enter the Second no.");
		b=c.nextInt();
		System.out.println("Before swapping\n 1st = "+a+"\n 2nd = "+b);
		s1.swap(a,b);
	
	}

}

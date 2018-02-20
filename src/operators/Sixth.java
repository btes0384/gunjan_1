package operators;

//to find greatest no. among 3 no. using ternary operator

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
	Sixth s1=new Sixth();
		int m,n,o;
		String s;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter first no.");
		m=c.nextInt();
		System.out.println("Enter second no.");
		n=c.nextInt();
		System.out.println("Enter third no.");
		o=c.nextInt();
		s=m>n?(m>o?"First no.is greater":(m==o?"First and Third no. are equal & greater":"Third no. is greater"))
				:(m==n?"First & Second no. are equal & greater":(n>o?"Second no. is greater":
					(n==o?"Second and Third no. are equal & greater":"Third no. is greater")));
		System.out.println(s);

	}

}

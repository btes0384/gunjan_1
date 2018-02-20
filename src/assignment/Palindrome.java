package assignment;

//To check PALINDROME NO.

import java.util.Scanner;

public class Palindrome {
	void palin(int n)
{ 
		int t,sum=0,temp;
		temp=n;
 while(n>0)
{
	t=n%10;
	sum=(sum*10)+t;
	n=n/10;
}
 if(temp==sum)
System.out.println("Palindrome number");
 else
	 System.out.println("Not Palindrome number");
}

public static void main(String[] args) {
int n;
Palindrome p=new Palindrome();
Scanner c=new Scanner(System.in);
System.out.println("Enter the no:-");
n=c.nextInt();
p.palin(n);
}
}

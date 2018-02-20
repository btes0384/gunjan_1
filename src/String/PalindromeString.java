package String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String s,t,j="";
		Scanner c=new Scanner (System.in);
		System.out.println("Enter the String");
		s=c.next();
		t=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			j=j+s.charAt(i);
		}
		if(t.equals(j))
		System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");

	}

}

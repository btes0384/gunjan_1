package String;

import java.util.Scanner;

//Reverse words at their own place

public class Reverse {

	public static void main(String[] args) {
		Scanner c=new Scanner (System.in);
		String s1;
		System.out.println("Enter the String");
		s1=c.nextLine();
		String s[]=s1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=s[i].length()-1;j>=0;j--)
			{
				System.out.print(s[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}

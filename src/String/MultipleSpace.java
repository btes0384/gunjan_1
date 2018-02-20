package String;

import java.util.Scanner;

public class MultipleSpace {

	public static void main(String[] args) {
		Scanner c=new Scanner (System.in);
		String s1,s2="";
		int j=0;
		System.out.println("Enter the String");
		s1=c.nextLine();
		String s[]=s1.split(" ");
		//System.out.println(s.length);
	for(int i=0;i<s.length;i++)
	{
		
		System.out.print(s[i]);
	}
	//System.out.println(s2);

}
}
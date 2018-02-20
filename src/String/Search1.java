package String;

//to search word using substring

import java.util.Scanner;

public class Search1 {
	public static void main(String[] args) {
		Scanner c=new Scanner (System.in);
		String s1,s,s3;
		System.out.println("Enter the String");
		s1=c.nextLine().toLowerCase();
		System.out.println("Enter the word to be searched");
		s=c.nextLine().toLowerCase();
		int j=0,count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' '||i==s1.length()-1)
			{
				if(i==s1.length()-1)
					s3=s1.substring(j,i+1);
				
					else
						{s3=s1.substring(j,i);
						
						}
				if(s.equals(s3))
				{
					
					count++;
				}
				j=i+1;
					
			}
		}
		if(count>0)
			System.out.println("Word found "+count+" times");
		else 
			System.out.println("Word not found");

}
}


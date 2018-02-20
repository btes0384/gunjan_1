package String;

//to find the string is anagram(different words with same characters) or not

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner c=new Scanner (System.in);
		String s1,s;
		Boolean flag=true;
		System.out.println("Enter the 1st String");
		s1=c.nextLine().toLowerCase();
		System.out.println("Enter the 2nd String");
		s=c.nextLine().toLowerCase();
		if(s1.length()==s.length()){
		for(int i=0;i<s1.length();i++)
		{	//flag=true;		
			for(int j=0;j<s.length();j++)
			{
	        	if(s1.charAt(i)==s.charAt(j))
					{
					flag=true;
					break;						
						}
	        	else
	        		flag=false;
	        }
			if(flag==false)
			break;
		}}
		else
			flag=false;
		if(flag==true)
			System.out.println(" Anagram String ");
		else
			System.out.println(" Not Anagram String");
		}
	}



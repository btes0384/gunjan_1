package String;

//to search a word from string using diff functions
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner c=new Scanner (System.in);
		String s1,s;
		Boolean flag=true;
		System.out.println("Enter the String");
		s1=c.nextLine().toLowerCase();
		System.out.println("Enter the word to be searched");
		s=c.nextLine().toLowerCase();
		String s2[]=s1.split(" ");
		
		//To Find Word using CONTAINS()
		/*if(s1.contains(s)) 
			System.out.println("Word found");
		else
			System.out.println("Not in the String");*/
		
		//To Find Word using SPLIT()
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i].equals(s))
			{	
				flag=true;
			     break;
			 }
			else
				flag=false;					
		}
		if(flag==true)
			System.out.println("Word found ");
		else
			System.out.println("Not in the String");
		
		
		
}}

package assignment;

//To Print Table Of a number

import java.util.Scanner;

public class Table {
	void tab(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

	public static void main(String[] args) {
		int n;
		Table t=new Table();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no :-");
		n=c.nextInt();
		t.tab(n);
		
	}

}

package OopsClass;

//To make student class and take name & marks from user and AUTO INCREMENT ID

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	String name;
	 int id;
	int marks;
	static int idn=1;
	InputStreamReader r=new InputStreamReader (System.in);
	BufferedReader br=new BufferedReader(r);
	Student() throws IOException
	{
		System.out.println("Enter name ");
		name=br.readLine();
		System.out.println("Enter marks ");
		marks=Integer.parseInt(br.readLine());
		id=idn;
		idn++;
		
		
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
		System.out.println("Id = "+id);
		System.out.println();
	}
	public static void main(String s[]) throws IOException
	{
		Student t1=new Student();
		Student t2=new Student();
		Student t3=new Student();
		t1.display();
		t2.display();
		t3.display();
		
		
	}

}

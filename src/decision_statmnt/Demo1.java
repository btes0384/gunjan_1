package decision_statmnt;

//to implement grading system using ELSE IF LADDER

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int marks;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=c.nextInt();
		if(marks>=85)
			System.out.println("Your Grade  = Excellent");
		else if(marks<85 && marks>=70)
			System.out.println("Your Grade = Very Good");
		else if(marks<70 && marks>=60)
			System.out.println("Your Grade = Good");
		else if(marks<60 && marks>=40)
			System.out.println("Your Grade = Average");
		else
			System.out.println("Your Grade = Fail");

	}

}

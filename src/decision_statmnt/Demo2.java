package decision_statmnt;

import java.util.Scanner;

//to implement grading system using SWITCH CASE
public class Demo2 {

	public static void main(String[] args) {
		int marks,s;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=c.nextInt();
		s=marks/10;
		switch(s)
		{
		case 10:	//since both are performing same function(No BREAK in this case)		
		case 9:
			System.out.println("Your Grade  = Excellent");
			break;
		case 8:			
		case 7:
			System.out.println("Your Grade  = Very Good");
			break;
		case 6:
			System.out.println("Your Grade  = Good");
			break;
		case 5:
			System.out.println("Your Grade  = Average");
			break;
			default:
				System.out.println("Your Grade  = Fail");
		}

	}

}

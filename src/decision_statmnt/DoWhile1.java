package decision_statmnt;
// to demonstrate DO WHILE loop( y/n option)
import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		char ch='n';
		
		Scanner c=new Scanner(System.in);
		do
		{
			if(ch!='y')
			System.out.println("Welcome");
			if(ch=='y')
				System.out.println("Congrats you got a coupon ");
			System.out.println("to continue press 'y' / other char to exit");
			ch=c.next().charAt(0);
		}while(ch=='y');

	}

}

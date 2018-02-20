package operators;
//To convert no. of days into months and days 
import java.util.Scanner;

public class Fifth {
	void convert(int m)
	{
		int s,t;
		s=m/30; //months
		t=m%30; //days
		System.out.println(m+" days = "+s+" months "+t+" days ");
	}

	public static void main(String[] args) {
		Fifth f1=new Fifth();
		int m;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter no. of days");
		m=c.nextInt();
		f1.convert(m);
		

	}

}

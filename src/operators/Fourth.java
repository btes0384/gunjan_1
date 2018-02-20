package operators;

//To calculate area of square ,area and circumference of circle

import java.util.Scanner;

public class Fourth {
	void square(int s)
	{
		System.out.println("The area of square is  "+(s*s));
		
	}
    void circle(int r)
    {
    	float pi=3.14f;
    	System.out.println("The circumfrence of circle = "+(2*pi*r));
    	System.out.println("The area of circle = "+(pi*r*r));    	
    }
	public static void main(String[] args) {
		int s,r;
		Fourth f=new Fourth();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the side of square");
		s=c.nextInt();
		f.square(s);
		System.out.println("Enter the radius of circle");
		r=c.nextInt();
		f.circle(r);	

	}

}

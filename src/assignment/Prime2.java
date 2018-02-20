package assignment;

//To print PRIME NUMBERS from 1-100

public class Prime2 {
	public static void main(String[] args) {	
		boolean flag;
		for(int n=1;n<=100;n++)
		{
			flag=true;
			
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break; //whenever condition is met inner for loop breaks & control goes to outer for loop
			}		
		}
		if(flag==true)
			System.out.println(n);
	}			
	}
	}



package pattern;
/*to print
 *     *
 *    ***
 *   *****
 */

public class loop7 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//rows
		{
			for(int j=3;j>i;j--)//space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)//*
			{
				
				System.out.print("*");
			}
			
			
			System.out.println();		
				
		}
		for(int i=2;i>=1;i--)//rows
		{
			for(int j=2;j>=i;j++)//space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)//*
			{
				
				System.out.print("*");
			}
			
			System.out.println();	
		}
	}
}


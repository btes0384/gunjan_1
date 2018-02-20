package pattern;
/* To Print
 * 1
   01
   101
   0101
   10101

 */

public class Loop5 {

	public static void main(String[] args) 
	{for(int i=1;i<=5;i++) //ROW
	{
		
		for(int k=i;k>=1;k--) //COLUMN k=i bcz in pattern change is in accordance to row no.
		{
			System.out.print(k%i);		
		}
		    System.out.println();
	 }
	 }

}

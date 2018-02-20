package pattern;
/*To Print 
   a
  abc
 abcde
*/
public class Loop8 {

	public static void main(String[] args) {
		int x;
		for(int i=1;i<=3;i++)
		{
			 x=97;
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				
				System.out.print((char)x);
				x++;
			}
			System.out.println();
		}
	}

}

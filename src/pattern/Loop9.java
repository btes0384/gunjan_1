package pattern;

/*To Print
   a
  aba
 abcbc
 */

public class Loop9
{
	public static void main(String[] args) {
		int x;
		for(int i=1;i<=3;i++)
		{
			 x=97;
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print((char)x);
				x++;
				
			}
			x=x-2;
			for(int c=2;c<=i;c++)
			{
				//x=x+2
				System.out.print((char)x);
				x--;//x++`
			}
			System.out.println();

}
}
}

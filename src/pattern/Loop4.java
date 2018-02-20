package pattern;
/* To Print
 * ____1
   ___12
   __123
   _1234
   12345
 */

public class Loop4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) //ROW
		{
			for(int j=5;j>i;j--) //SPACE
			{
				System.out.print("_");
			}
		
			for(int k=1;k<=i;k++) //COLUMN
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}

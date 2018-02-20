package pattern;
/*
1
12
123
1235
12357

 */
public class Loop6 {

	public static void main(String[] args) {
		{
			boolean flag;
			for(int i=1;i<=5;i++) //ROW
		
		{ int count=0;
			for(int j=1;j<=i*2;j++)//bandwidth
			{
				flag=true;
				for(int k=2;k<=j/2;k++)//checking
				{
					if(j%k==0)
					{
						flag=false;
						break; //whenever condition is met inner for loop breaks & control goes to outer for loop
					}
					
				}
				if((flag==true)&&(count<i))//if count=1 then count<=i to print nos equal to i
					{System.out.print(j);
				count++;}
				
			}
			System.out.println();
		}
	}

}
}
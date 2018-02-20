package assignment;

//To Print odd numbers from 1-100

public class Even_odd {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				continue;
				else
					System.out.println(i);
		}

	}

}

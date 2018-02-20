package String;

//to compare and reverse strings

public class String1 {

	public static void main(String[] args) {
		String s1="City Chandigarh is beautiful";
		String s="City Chandigarh is beautiful";
		String v="CITY CHANDIGARH IS BEAUTIFUL";
		String a="";
		System.out.println(s1.charAt(5));//to print character at index 5
		int count=0;
		for(int i=0;i<s1.length();i++)
		{//to count number of vowels in string
			if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u'))
				count++;
		}
		System.out.println("Number of Vowel in String = "+count);
		
		//To compare Two STRINGS equals()
		if(s1.equals(s))
			System.out.println("Same strings");
		else
			System.out.println("Different String");
		
		
		//To compare Two STRINGS equalsIgnoreCase() ignoring the case of string
				if(s1.equalsIgnoreCase(v))
					System.out.println("Same strings");
				else
					System.out.println("Different String");
				
			for(int i=s.length()-1;i>=0;i--)
			{
				//To Reverse the string
				System.out.print(s.charAt(i));
				//To Store reverse in another string
				a=a+s.charAt(i);
			}
			System.out.println("\n"+a);
		
	}

}

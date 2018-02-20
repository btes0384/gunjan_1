package Array;

//To find MAX in array
public class Array2 {

	public static void main(String[] args) {

		int[]arr={1,2,3,45,6};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The max number of array is "+max);
	}

}

package hi1308;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String args[])
	{
		int arr[]= {
				100,1,-20,30,0
		};
		int search;
		Scanner s=new Scanner(System.in);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		search=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element found");
				break;
			}
		}
		
	}


}

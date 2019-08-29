package hi1308;

import java.util.Arrays;

public class Sort {
	
	private int arr[];
	public void sortArray(int arr[])
	{
		this.arr=arr;
		System.out.println("befor sorting");
		for(int i:this.arr)
		{
			System.out.println(i+" ");
		}
		Arrays.sort(this.arr);
		System.out.println("After sorting ");
		for(int i:this.arr)
		{
			System.out.println(i+" ");
		}
	}
	public boolean find(int item)
	{
		int i=Arrays.binarySearch(this.arr,item);
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

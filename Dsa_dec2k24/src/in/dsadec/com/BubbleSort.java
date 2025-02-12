package Algo_Camp_DSA;

public class BubbleSort {
	public static void main(String[] args)
	{
		int arr[]= {5,1,4,2,3,5};
		sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	/*static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
			}
		}
		for(int i:arr)
		{
		System.out.print(i);
		}
	}
	static void swap(int [] arr,int j,int i)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}*/
	/*static void sort(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr.length-1;j>arr.length-i-1;j--)
			{
				if(arr[j]>arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
		
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}*/
	static void sort(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{  
			boolean check=true;
			for(int j=arr.length-1;j>arr.length-i-1;j--)
			{
				if(arr[j]<arr[j-1])
				{
					check=false;
					swap(arr,j,j-1);
				}
			}
			if(check==true)
			{
				System.out.print(" array is already Sorted ");
				break;
			}
		}
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

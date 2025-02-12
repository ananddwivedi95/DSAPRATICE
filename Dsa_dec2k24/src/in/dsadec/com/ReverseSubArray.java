package Scaler_academy_DSA;

public class ReverseSubArray {
     public static void main(String[] args)
     {
    	 int arr[]= {3,2,7,9,12,6,8,4,1};
    	 SubArray.subArray(arr, 2, 7);
     }
}
class SubArray
{
	static void subArray(int [] arr,int start,int end)
	{
		int temp=0;
		for(int i=start;i<end;i++)
		{
			temp=arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
			end--;
		}
		print(arr);
	
	}
	static void print(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

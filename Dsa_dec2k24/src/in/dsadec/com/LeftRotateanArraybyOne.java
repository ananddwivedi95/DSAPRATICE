package Algo_Camp_DSA;

public class LeftRotateanArraybyOne {
    public static void main(String[] args)
    {
    	int arr[]= {1, 2, 3, 4, 5};
    	RotateByOne(arr,arr.length);
    	
    }
    static void RotateByOne(int[] arr,int n)
    {
    	int temp[]=new int[arr.length];
    	int j=0;
    	for(int i=1;i<arr.length;i++)
    	{
    		temp[j++]=arr[i];
    	}
    	temp[arr.length-1]=arr[0];
    	j=0;
    	for(int i:temp)
    	{
    		arr[j++]=i;
    	}
    	
    }
}

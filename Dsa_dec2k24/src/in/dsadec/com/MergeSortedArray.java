package Algo_Camp_DSA;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args)
    {
    	int arr[]={1,2,3,0,0,0};
    	int m=3;
    	int arr_r[]= {2,5,6};
    	int n=3;
    	mergeSortedArray(arr,arr_r,m,n);
    }
    static int[] mergeSortedArray(int arr[],int arr_r[],int m,int n)
    {   
    	if(n==0)
    	{
    		return arr;
    	}
    	else if(m==0)
    	{
    		return arr_r;
    	}
    	int index=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i>=m)
    		{
    			arr[i]=arr_r[index++];
    		}
    	}
    	Arrays.sort(arr);
    	return arr;
    }
}

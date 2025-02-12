package Algo_Camp_DSA;

public class FindTheMissingNumberInAnArray {
    public static void main(String[] args)
    {
    	int arr[]= {3,0,1};
    	missingNumber(arr);
    }
    static void missingNumber(int []arr)
    {
    	int xor1=0;
    	int xor2=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		xor1=xor1^arr[i];
    		xor2=xor2^i+1;
    	}
    	System.out.println(xor1^xor2);
    	
    }
}

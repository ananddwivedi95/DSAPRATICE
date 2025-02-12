package Algo_Camp_DSA;

public class MissingNumber {
    public static void main(String[] args)
    {
    	int arr[]= {0,1};
    	missingNumber(arr);
    }
    //brute_Force
    /*static void missingNumber(int arr[])
    {
    	int arr_size=arr.length;
        int sum=0;
        int sum_required=arr_size*(arr_size+1)/2;
        for(int i=0;i<arr.length;i++)
        {
           sum=sum+arr[i];
        }
        
        System.out.println(sum_required-sum);
    }*/
    //better_Solution
    static void missingNumber(int arr[])
    {
    	int xor_1=0;
    	int xor_2=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		xor_1=xor_1^arr[i];
    		xor_2=xor_2^(i+1);
    	}
    	System.out.println(xor_1^xor_2);
    }
}

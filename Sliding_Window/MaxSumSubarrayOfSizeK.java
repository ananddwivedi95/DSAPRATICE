package in.dsadec.com.Sliding_Window;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args)
    {
        int[] arr={100, 200, 300, 400};
        int k=4;
        System.out.print(SlidingWindowSum(arr,k));



    }
    static int SlidingWindowSum(int[] arr,int k)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int maxSum=sum;
        int i=0;
        int j=k;
        while(j<arr.length)
        {
            sum=sum-arr[i]+arr[j];
            i++;
            j++;
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}

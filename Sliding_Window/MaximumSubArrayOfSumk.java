package in.dsadec.com.Sliding_Window;

public class MaximumSubArrayOfSumk {
    public static void main(String[] args)
    {
        int arr[]={3,2,4,5,1,1,1,1,1,3,3};
        System.out.println(maxSubArray(arr,5));

    }
    static int maxSubArray(int[] arr,int k)
    {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int sum=arr[j];
        while(j<arr.length)
        {
            if(sum<k)
            {
                j++;
                if(j<arr.length)
                {
                    sum=sum+arr[j];
                }
            }
            else if(sum==k)
            {
                max=Math.max(max,j-i+1);
                j++;
                if(j<arr.length)
                {
                    sum=sum+arr[j];
                }
            }
            else if(sum>k)
            {
                sum=sum-arr[i];
                i++;
            }
        }
       return max;
    }
}

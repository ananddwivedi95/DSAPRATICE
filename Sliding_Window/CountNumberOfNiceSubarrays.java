package in.dsadec.com.Sliding_Window;

public class CountNumberOfNiceSubarrays {
    public static void main(String[] args)
    {
        int arr[]={1,1,0,1};
        System.out.print(longestSubarray(arr));
    }
    static int longestSubarray(int[] arr)
    {      int i=0;
        int j=0;
        int countZero=0;
        int maxSubArray=0;
        while(j<arr.length)
        {
            if(arr[j]==0)
            {
                countZero++;
            }
            while(countZero>1)
            {
                if(arr[i]==0)
                {
                    countZero--;
                }
                i++;
            }
            maxSubArray=Math.max(maxSubArray,j-i);
            j++;
        }
        return maxSubArray;
    }
}

package in.dsadec.com.Sliding_Window;

public class SmallestSubarraywWithSumGreaterThanX {
    public static void main(String[] args)
    {
        int []arr={1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(5,arr));
    }
    public static int smallestSubWithSum(int k, int[] arr) {
        // Your code goes here
        int i=0;
        int j=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        boolean flag=true;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            j++;
            while(sum>k)
            {
                flag=false;
                minLength=Math.min(minLength,j-i);
                sum=sum-arr[i];
                i++;
            }
        }
        if(flag==true)
        {
            return 0;
        }
        return minLength;

    }
}

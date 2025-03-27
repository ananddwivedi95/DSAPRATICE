package in.dsadec.com.TwoPointer;

public class MaximumCountofPositiveIntegerandNegativeInteger {
    public static void main(String[] args)
    {
        int [] arr={5,20,66,1314};
        System.out.println(maximumCount(arr));
    }
    static int maximumCount(int[] arr) {
       int negativeCount=0;
       int positiveCount=0;
       int i=0;
       int j=arr.length-1;
       while(i<=j)
       {
           if(arr[i]<0)
           {
               negativeCount++;
               i++;
           }
           else if(arr[i]==0)
           {
               i++;
           }
           else if(arr[j]==0)
           {
               j--;
           }
           else if(arr[j]>0)
           {
               positiveCount++;
               j--;
           }
       }

        return (negativeCount>=positiveCount) ? negativeCount : positiveCount;
    }
}

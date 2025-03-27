package in.dsadec.com.TwoPointer;

import java.util.ArrayList;

public class SlidingWindowMaximum {
    public static void main(String[] args)
    {
        int []arr={1,3,-1,-3,5,3,6,7};
        maxSlidingWindow(arr,3);
    }
    static int[] maxSlidingWindow(int[] arr, int k) {
        int []result=new int[arr.length-(k-1)];
        int i=0;
        int j=k-1;
        int currentMax=arr[0];
        int index=0;
        while(j<arr.length)
        {
            if(i<j)
            {
                currentMax=Math.max(currentMax,arr[i]);
                i++;
            }
            else{
                currentMax=Math.max(currentMax,arr[i]);
                result[index++]=currentMax;
                j++;
                i=j-(k-1);
                //currentMax=arr[i];
                currentMax=Integer.MIN_VALUE;
            }
        }

        for(int res:result)
        {
            System.out.print(res+" ");
        }
        return result;
    }
}
package in.dsadec.com.TwoPointer;

import java.util.Arrays;
import java.util.Spliterator;

public class FindTripletsWithZeroSum {
    public static void main(String[] args)
    {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(findTriplets(arr));
    }
    static boolean findTriplets(int[] arr) {
        // code here.
        //using 2 pointer approch
        Arrays.sort(arr);  // sort the array
        for(int i=0;i<arr.length-2;i++)
        {
            int rem=-arr[i];  //remaning sum(1 element+2 element) present in the array after sum
            int j=i+1;  // for second element track
            int k=arr.length-1;  // for third elelment track
            while(j<k)
            {
                if(arr[j]+arr[k]==rem)
                {
                    return true;
                }
                else if(arr[j]+arr[k]>rem)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return false;
    }
}

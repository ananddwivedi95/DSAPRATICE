package Algo_Camp_DSA;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args)
    {
       int	nums[] = {-2,1,-3,4,-1,2,1,-5,4};
       majority(nums,nums.length);
    }
    //bruteforce_Solution
    
    /*
    static void majority(int nums[],int n)
    {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }
    	System.out.println(maxi);
    }*/
    
    static void majority(int nums[],int n)
    {
    	int maxi=Integer.MIN_VALUE;
    	for (int i = 0; i < n; i++) {
           
            int sum = 0;

            //add all the elements of subarray:
            for (int k = i; k < n; k++) {
                sum += nums[k];
                maxi = Math.max(maxi, sum);
            }

            
        }
    	System.out.println(maxi);
    }
    
}

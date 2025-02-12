package Algo_Camp_DSA;

public class CheckifArrayIsSortedandRotated {
     public static void main(String[] args)
     {
    	 int nums[] = {3,4,5,1,2};
    	 System.out.println(sortedArray(nums));
     }

	 static boolean sortedArray(int nums[]) {
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>nums[i+1])
			{
				return false;
			}
		}
		return true;
	}
}

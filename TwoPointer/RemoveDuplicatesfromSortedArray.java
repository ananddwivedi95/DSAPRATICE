package in.dsadec.com.TwoPointer;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        int k = removeDuplicates(arr);
        System.out.println("Unique elements count: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] nums) {

        int left = 0;
        int right = 1;
        int count = 1;
     while(right<nums.length)
     {
         if(nums[left]==nums[right])
         {
             right++;
         }
         else {
             nums[left+1]=nums[right];
             left++;
             right++;
             count++;
         }
     }
        return count;
    }
}

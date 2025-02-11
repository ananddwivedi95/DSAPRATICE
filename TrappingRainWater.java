package in.dsadec.com;

public class TrappingRainWater {
    public static void main(String[] args)
    {
        int arr[] = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(trap(arr));
    }

    static int trap(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;  // Track the max height from the left
        int rightMax = 0; // Track the max height from the right
        int sum = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                // Water trapped depends on the left side
                if (arr[left] >= leftMax) {
                    leftMax = arr[left]; // Update the max on the left
                } else {
                    sum += (leftMax - arr[left]); // Add trapped water
                }
                left++; // Move the left pointer inward
            } else {
                // Water trapped depends on the right side
                if (arr[right] >= rightMax) {
                    rightMax = arr[right]; // Update the max on the right
                } else {
                    sum += (rightMax - arr[right]); // Add trapped water
                }
                right--; // Move the right pointer inward
            }
        }

        return sum;
    }
}

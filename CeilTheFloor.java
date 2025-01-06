package in.dsadec.com;


import java.util.Arrays;

public class CeilTheFloor {
    public static void main(String[] args)
    {
        int arr[]={5, 6, 8, 9, 6, 5, 5, 6};
        getFloorAndCeil(arr,2);
    }
    static int[] getFloorAndCeil(int arr[],int target) {
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        if (arr[arr.length - 1] < target) {
            int ans[] = {arr[end], -1};
            return ans;
        }
        if (arr[0] > target) {
            int ans[] = {-1, arr[0]};
            return ans;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                int ans[] = {arr[mid], arr[mid]};
                return ans;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        int ans[] = {arr[end], arr[start]};
        return ans;
    }

}
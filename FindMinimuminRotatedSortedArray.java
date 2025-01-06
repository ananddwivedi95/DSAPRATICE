package in.dsadec.com;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args)
    {
        int arr[]={2,5,6,0,0,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            if(arr[mid]<arr[end])
            {
                end=mid;
            }
        }
        return arr[end];
    }
}

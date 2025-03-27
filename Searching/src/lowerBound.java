public class lowerBound {
    public static void main(String[] args)
    {
        int arr[]={2,3,1,3,4,5,6,7,3,45,35,54};
        System.out.println(lowerBound(arr,3));
    }
    static int lowerBound(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;
        int result=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=target)
            {
                result=Math.min(result,mid);
                right=mid-1;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
        }
        return result;
    }
}

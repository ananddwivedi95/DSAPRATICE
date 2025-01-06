package in.dsadec.com;

public class FindKthRotation {
    public static void main(String[] args)
    {
        int arr[]={2, 4, 6, 9};
        System.out.print(findRotation(arr));
    }
    static int findRotation(int arr[])
    {
        //int[] arrr = arr.stream().mapToInt(Integer::intValue).toArray();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return end;
    }
}

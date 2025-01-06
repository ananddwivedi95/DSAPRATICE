package in.dsadec.com;

public class BinarySearch {

	public static void main(String[] args) {
        int arr[]= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
       System.out.println(binarySearch(arr,3));

	}
	static int binarySearch(int arr[], int target)
	{
		int start=0;
		int end =arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==target)
			{
				return target;
			}
			if(target<arr[mid])
			{
				end=mid-1;
			}
			if(target>arr[mid])
			{
				start=mid+1;
			}
		}
		return -1;
	}

}

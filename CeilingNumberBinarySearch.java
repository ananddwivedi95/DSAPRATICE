package in.dsadec.com;

public class CeilingNumberBinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,3,5,9,14,16,18};
		System.out.println(ceilingNumber(arr,5));

	}
	static int ceilingNumber(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==target)
			{
				return target;
			}
			if(arr[mid]>target)
			{
				end=mid-1;
			}
			if(arr[mid]<target)
			{ 
				start=mid+1;
			}
		}
		if(arr[arr.length-1]<target)
		{
			return-1;
		}
		return arr[start];
	}

}

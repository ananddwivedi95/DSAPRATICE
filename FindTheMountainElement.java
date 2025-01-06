package in.dsadec.com;

public class FindTheMountainElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,3,1};
		int target=3;
		System.out.println(mountainElement(arr,target));
	}
	static int mountainElement(int arr[],int target)
	{
		int peak=peakElement(arr);
		int min_index=binarySearch(arr,target,0,peak);
		if(min_index==-1)
		{
			min_index=binarySearch(arr,target,peak,arr.length-1);
		}
		return min_index;
	}
	static int binarySearch(int []arr,int target,int start,int end)
	{
		
		while(start<=end)
		   {
			   int mid=(start+end)/2;
			   if(arr[mid]==target)
			   {
				   return mid;
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
			return -1;
	}
	static int peakElement(int arr[])
	{
		int peak=0;
	       if(arr.length==0)
	       {
	        return -1;
	       }
	       if(arr.length==1)
	       {
	        return arr.length-1;
	       }
	       if(arr[arr.length-2]<arr[arr.length-1])
	       {
	        return arr.length-1;
	       }
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]<arr[i+1])
	            {
	              peak=i+1;
	            }
	            else
	            {
	                break;
	            }
	        }
	       return peak;
	}

}

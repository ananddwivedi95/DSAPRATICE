package in.dsadec.com;

public class BinarySearchAstrologistic {

	public static void main(String[] args) {
		 int arr[]= {89,45,22,18,9,8};
	       System.out.println(binarySearch(arr,8));

	}
	static int binarySearch(int arr[],int target)
	{   
		boolean isAst=false;
		if(arr[0]<arr[arr.length-1])
		{
			isAst=true;
			System.out.println("arr is in accending ");
		}
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
            	if(isAst==false)
            	{
            	  start=mid+1;
            	}
            	else
            	{
            		end=mid-1;
            	}
            }
            if(arr[mid]<target)
            {
            	
            	if(isAst==false)
            	{
            		end=mid-1;
            	}
            	else
            	{
            		start=mid+1;
            	}
            }
		}
		return -1;
	}

}

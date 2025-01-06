package in.dsadec.com;

public class Findpositionofanelementinasortedarrayofinfinitenumbers {

	public static void main(String[] args) {
      int arr[]= {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
      int target=10;
     System.out.println(search(arr,target));
	}
	static int search(int arr[],int target)
	{
		int start=0;
		int end=1;
		while(target<=arr[end])
		{
		  start=end+1;
		  end=end*2;
		  
		  if(end>=arr.length)
		  {
			  end=arr.length-1;
			  break;
		  }
		  
		}
		return searchElement(arr,target,start,end);
	
	}
	static int searchElement(int[] arr,int target,int start,int end)
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

}

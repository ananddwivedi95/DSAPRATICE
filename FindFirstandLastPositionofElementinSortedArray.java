package in.dsadec.com;
import java.util.*;
public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		int arr[]= {5,7,7,7,7,8,8,10};
		int target=7;
	int arr1[]=firstAndLastElement(arr,target);
	System.out.println("["+arr1[0]+" "+arr1[1]+"]");
	
	}
	static int[] firstAndLastElement(int arr[],int target)
	{
		int []res= {-1,-1};
		ArrayList<Integer> arrl=new ArrayList<Integer>();
		if(arr.length==0)
		{
		    return res;
		}
		if(arr[arr.length-1]==target)
		{
			for(int i=arr.length-1;i>=0;i--)
			{
				if(arr[i]==target)
				{
					arrl.add(i);
				}
				break;
			}
			Collections.sort(arrl);
			int[] array = new int[arrl.size()];
	        Arrays.setAll(array, i -> arrl.get(i));
	        res[0]=array[0];
	        res[1]=array[array.length-1];
	        return res;
		}
		int start=0;
		int end=arr.length-1;
		int last_Index=0;
		boolean flag=false;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==target)
			{
				if(arr[mid+1]==target)
				{
					start=mid+1;
					end=mid+1;
				}
				else
				{
					flag=true;
					last_Index=mid;
					break;
				}
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
		
		if(flag==true)
		{
		for(int i=last_Index;i>=0;i--)
		{
			if(arr[i]==target)
			{
				arrl.add(i);
			}
			else
			{
			break;
			}
		}
		Collections.sort(arrl);
		
	//	System.out.println(arrl);
		int[] array = new int[arrl.size()];
        Arrays.setAll(array, i -> arrl.get(i));
        //System.out.println("["+array[0]+" "+array[1]+"]");
        res[0]=array[0];
        res[1]=array[array.length-1];
      //  System.out.println("["+res[0]+" "+res[1]+"]");
        return res;
		}
		
		
		return res;
	}

}

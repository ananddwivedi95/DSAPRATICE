package in.dsadec.com;

public class FindSmallestLetterGreaterThanTargetBinarySearch {

	public static void main(String[] args) {
		Character arr[]= {'c','f','j'};
		System.out.println(smallestLatter(arr,'a'));
	}
	static char smallestLatter(Character arr[],Character target)
	{
		int start=0;
		int end=arr.length-1;
		if((int)arr[arr.length-1]<(int)target||(int)arr[arr.length-1]==(int)target)
        {
             return arr[0];
        }
		while(start<=end)
		{
			int mid=(start+end)/2;
			if((int)arr[mid]==(int)target)
			{
			   start=mid+1;
			}
			if((int)arr[mid]>(int)target)
			{
				end=mid-1;
			}
			if((int)arr[mid]<(int)target)
			{
				start=mid+1;
			}
		}
        
		return arr[start];
    }
}

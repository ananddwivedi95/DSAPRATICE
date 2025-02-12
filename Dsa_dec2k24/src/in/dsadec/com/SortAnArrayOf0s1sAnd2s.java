package Scaler_academy_DSA;

public class SortAnArrayOf0s1sAnd2s {
  public static void main(String[] arhs)
  {
	  int arr[]= {1,2,0};
	  SortedArray.sort(arr);
  }
}
//BruteForce
 /*class SortedArray {
	 //BruteForce
	   static void sort(int [] arr)
	   {
		   for(int i=0;i<arr.length;i++)   
		   {
			   for(int j=i+1;j<arr.length;j++)
			   {
				   if(arr[i]>arr[j]) {
					   int temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }
		   //print array
		   for(int i:arr)
		   {
			   System.out.print(i+" ");
		   }
	   }
	}*/

//betterforce
/*class SortedArray
{
	static void sort(int [] arr)
	{
		int count_0=0;
		int count_1=0;
		int count_2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count_0++;
			}
			else if(arr[i]==1)
			{
				count_1++;
			}
			else if(arr[i]==2)
			{
				count_2++;
			}
		}
		System.out.println(count_0+" "+count_1+" "+count_2);
		for(int i=0;i<count_0;i++)
		{
			arr[i]=0;
		}
		for(int i=count_0;i<count_0+count_1;i++)
		{
		arr[i]=1;
		}
		for(int i=count_0+count_1;i<(count_0+count_1+count_2);i++)
		{
			arr[i]=2;
		}
		//print array
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		}
	}*/
 class SortedArray
 {
	 static void sort(int arr[])
	 {
		 int low=0;
		 int mid=0;
		 int high=arr.length-1;
		 while(mid<=high)
		 {   
			 if(arr[mid]==0)
			 {
				 int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			 }
			 else if(arr[mid]==1)
			 {
				 mid++;
			 }
			 else if(arr[mid]==2)
			 {
				int  temp=arr[mid];
				 arr[mid]=arr[high];
				 arr[high]=temp;
				 high--;
			 }
		 }
		 for(int i:arr)
		 {
			 System.out.print(i+" ");
		 }
	 }
 }
     



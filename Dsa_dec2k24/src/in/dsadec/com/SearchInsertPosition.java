package Algo_Camp_DSA;

public class SearchInsertPosition {
   public static void main(String[] args)
   {
	   int arr[]= {1,3,5,6};
	   int target=1;
	   searchInsertPosition(arr,target);
   }
   static void searchInsertPosition(int arr[],int target)
   {
	   if(target>arr[arr.length-1])
	   {
		   System.out.println(arr.length);
	   }
	   
	   boolean check=true;
	   if(target<=arr[arr.length-1])
	   {
		   if(target==arr[arr.length-1])
		   {
			   System.out.println(arr.length-1);
		   }
		   
		   if(target<arr[arr.length-1])
		   {
			   for(int i=0;i<arr.length;i++)
			   {
				   if(arr[i]==target)
				   {   check=false;
					   System.out.println(i);
				   }
			   }
		   }
		   
	   }
	   if(check==true)
	   {
		   for(int i=0;i<arr.length-1;i++)
		   {
			   if(target>arr[i]&&target<arr[i+1])
			   {
				 System.out.println(i+1);  
			   }
		   }
	   }
   }
}

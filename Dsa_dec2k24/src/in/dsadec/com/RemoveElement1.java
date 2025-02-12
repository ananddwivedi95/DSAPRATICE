package Algo_Camp_DSA;

public class RemoveElement1 {
   public static void main(String[] args)
   {
	   int arr[]= {0,1,2,2,3,0,4,2};
	   int val=2;
	 int result=  removeElement(arr,val);
	 System.out.println(result);
	 
	 for(int i:arr)
	 {
		 System.out.print(i);
	 }
	 
   }
   static int removeElement(int arr[],int val)
   {
	   int count=0;
	   int index=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==val)
		   {
			   continue;
		   }
		   arr[index++]=arr[i];
		   count++;
	   }
	   return count;
   }
}

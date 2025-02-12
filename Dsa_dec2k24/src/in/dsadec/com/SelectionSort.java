package Algo_Camp_DSA;

public class SelectionSort {
   public static void main(String[] args)
   {
	   int arr[]= {10,8,2,3,1,4};
	   selectionSort(arr);
   }
   /*static void selectionSort(int arr[])
   {
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int index=i;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[j]<arr[index])
			   {
				   index=j;
			   }
		   }
		   swap(arr,i,index);
	   }
	   for(int i:arr)
	   {
		   System.out.print(i+" ");
	   }
   }
   static void swap(int arr[],int i,int index)
   {
	   int temp=arr[index];
	   arr[index]=arr[i];
	   arr[i]=temp;
   }*/
   //for grater element is sifted at the last of the element 
   static void selectionSort(int arr[])
   {
	   for(int i=arr.length-1;i>0;i--)
	   {
		   int index=i;
		   for(int j=i-1;j>=0;j--)
		   {
			   if(arr[j]>arr[index])
			   {
				   index=j;
			   }
		   }
		   swap(arr,i,index);
	   }
	   for(int i:arr)
	   {
		   System.out.print(i+" ");
	   }
   }
   static void swap(int arr[],int i,int index)
   {
	   int temp=arr[index];
	   arr[index]=arr[i];
	   arr[i]=temp;
   }
}

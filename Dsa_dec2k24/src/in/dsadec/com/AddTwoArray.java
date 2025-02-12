package Algo_Camp_DSA;

import java.util.ArrayList;

public class AddTwoArray {
      public static void main(String[] args)
      {
    	 
			/*
			 * int arr1[]= {5,6,7}; int arr2[]= {3,4,4,6};
			 */
    	  int arr1[]= {9,9};
    	  int arr2[]= {9,9,9,9};
    	System.out.println(addTwoArray(arr1,arr2));
    }

	private static ArrayList<Integer> addTwoArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		while(i>=0||j>=0||carry>0)
		{
			int sum=0;
			sum+=carry;
			if(i>=0)
			{
				sum+=arr1[i];
			}
			if(j>=0){
				sum+=arr2[j];
			}
			int rem=sum%10;
			carry=sum/10;
			arr.add(0,rem);	
		i--;
		j--;
		}
		
		return arr;
	}
}

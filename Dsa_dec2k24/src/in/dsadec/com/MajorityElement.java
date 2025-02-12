package Algo_Camp_DSA;

import java.util.HashMap;

public class MajorityElement {
   public static void main(String[] args)
   {
	  int arr[]= {2,2,1,1,1,2,2}
;	  int majority_Element =SolutionMajorityElement.majorityElement(arr);
      System.out.println(majority_Element);
   }
}
//bruteforce_Solution
/*class SolutionMajorityElement{
	static int majorityElement(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{      int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count>arr.length/2)
				{
					return arr[i];
				}
			}
		}
		return 0;
	}
}*/
//better_Solution
/*class SolutionMajorityElement
{
	static int majorityElement(int [] arr)
	{
		HashMap<Integer,Integer> HS= new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			if(HS.containsKey(arr[i]))
			{
				HS.put(arr[i],HS.get(arr[i])+1);
			}
			else
			{
			   HS.put(arr[i], 1);	
			}
		}
		int majorityElement=0;
		for (Integer key : HS.keySet()) { //keyset gives the set of all keys one by one as per loop will ittratre and get(key) method give their respective value
            if (HS.get(key) > arr.length/2) {
                
                return key; // Found the majority element, exit the loop
            }
        }
		return 0;
	}
}*/
//optimal_Solution
class SolutionMajorityElement
{
   static int  majorityElement(int [] arr)
	{
	   int count=0;
	   int current_Element=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(count==0)
		   {
			   count=1;
			   current_Element=arr[i];
		   }
		   else if(current_Element==arr[i])
		   {
			   count++;
		   }
		   else
		   {
			   count--;
		   }
	   }
	   int count_check=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(current_Element==arr[i])
		   {
			   count_check++;
			   if(count_check>arr.length/2)
			   {
				   return current_Element;
			   }
		   }
	   }
	   
		return 0;
	}
}

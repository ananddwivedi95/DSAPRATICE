package Algo_Camp_DSA;

import java.util.HashSet;

public class UnionofTwoSortedArrays {
    public static void main(String[] args)
    {
    	int arr_1[]= {1,2,3,4,5};
    	int arr_2[]= {2,3,4,4,5,6,8};
   
    	HashSet<Integer> hs= new HashSet<Integer>();
    	for(int i=0;i<arr_1.length;i++)
    	{
    		if(hs.contains(arr_1[i]))
    		{
    			continue;
    		}
    		else
    		{
    		hs.add(arr_1[i]);
    		}
    	}
    	for(int i=0;i<arr_2.length;i++)
    	{
    		if(hs.contains(arr_2[i]))
    		{
    			continue;
    		}
    		else
    		{
    		hs.add(arr_2[i]);
    		}
    	}
    	System.out.println(hs);
        int union_array[]=new int[hs.size()];
        int index=0;
        Integer union_temp[]=hs.toArray(new Integer[0]);
        for(Integer i: union_temp)
        {
        	union_array[index++]=i;
        }
        for(int i: union_array)
        {
        	System.out.print(i+" ");
        }
    }
}

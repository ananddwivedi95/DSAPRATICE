package in.dsadec.com;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args)
    {
        int arr[]={2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
      List l=  majorityElement(arr);
      System.out.println(l);
    }
    static List majorityElement(int arr[])
    {
        List<Integer> list= new ArrayList();
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hs.containsKey(arr[i]))
            {
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else {
                hs.put(arr[i],1);
            }
        }
        for(Integer key:hs.keySet())
        {
            if(hs.get(key)>=arr.length/3)
            {
                list.add(key);
            }
        }
        return list;
    }
}
//optimal
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] arr) {
        // Your code goes here.

        int maj1=0;
        int count1=0;
        int maj2=0;
        int count2=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==maj1)
            {
                count1++;
            }
            else if(arr[i]==maj2)
            {
                count2++;
            }
            else if(count1==0)
            {
                maj1=arr[i];
                count1=1;
            }
            else if(count2==0)
            {
                maj2=arr[i];
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        List<Integer> list=new ArrayList();
        int freq1=0;
        int freq2=0;
        for(int i:arr)
        {
            if(i==maj1)
            {
                freq1++;
            }
            if(i==maj2)
            {
                freq2++;
            }
        }
        if(freq1>arr.length/3)
        {
            list.add(maj1);
        }
        if(freq2>arr.length/3)
        {
            list.add(maj2);
        }
        Collections.sort(list);
        return list;
    }
}


package in.dsadec.com.TwoPointer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args)
    {
        int []arr={9,12,5,10,14,3,10};
        int pivot=10;
        partitionArray(arr,pivot);
    }
    static void partitionArray(int[] arr,int pivot)
    {
        // it's a part of 1st and 2nd approach
       /*int ii=0;
       ArrayList<Integer> smallest=new ArrayList<>();
       ArrayList<Integer> mid=new ArrayList<>();
       ArrayList<Integer> greater= new ArrayList<>();
       while(ii<arr.length)
       {
           if(arr[ii]<pivot)
           {
               smallest.add(arr[ii]);
               ii++;
           }
           else if(arr[ii]==pivot)
           {
               mid.add(arr[ii]);
               ii++;
           }
           else if(arr[ii]>pivot)
           {
               greater.add(arr[ii]);
               ii++;
           }

       }*/

       // approach -1
       /*int [] result= new int[arr.length];
       int ii=0; //for smallest ArrayList
       int j=0; // for mid ArrayList
       int k=0; //for greater ArrayList
       int index=0;
       while(index<result.length)
       {
           if(index<smallest.size())
           {
               result[index]= smallest.get(ii);
               index++;
               ii++;
           }
           else if(index<smallest.size()+ mid.size())
           {
               result[index]= mid.get(j);
               index++;
               j++;
           }
           else if(index< smallest.size()+ mid.size()+ greater.size())
           {
               result[index]= greater.get(k);
               index++;
               k++;
           }
       }*/
       //approach - 2
       /*int index=0;
       ii=0; //the smallest
        while(ii<smallest.size())
        {
            result[index]=smallest.get(ii);
            index++;
            ii++;
        }
        ii=0;//mid
        while(ii<mid.size())
        {
            result[index]=mid.get(ii);
            index++;
            ii++;
        }
        ii=0;//greater
        while(ii<greater.size())
        {
            result[index]=greater.get(ii);
            index++;
            ii++;
        }*/


        //approach -3 this approach is using only one array for store result but in previous we store 3 ArrayList apart from result Array so that it is efficient as behave of Space Complexity
        int ii=0;
        int lessCount=0;
        int equalCount=0;
        while(ii<arr.length)
        {
            if(arr[ii]<pivot)
            {
                lessCount++;

            }
            if(arr[ii]==pivot)
            {
                equalCount++;

            }
            ii++;
        }
       /* System.out.print(lessCount);
        System.out.print(equalCount);*/
        ii=0;
        int [] result=new int[arr.length];
        int i=0;
        int j=lessCount;
        int k=lessCount+equalCount;
        while(ii<arr.length)
        {
            if(arr[ii]<pivot)
            {
                result[i]=arr[ii];
                i++;
                ii++;
            }
            else if(arr[ii]>pivot)
            {
                result[k]=arr[ii];
                k++;
                ii++;
            }
            else if(arr[ii]==pivot)
            {
                result[j]=arr[ii];
                j++;
                ii++;
            }
        }
        for(int a:result)
        {
            System.out.print(a+" ");
        }
    }
}

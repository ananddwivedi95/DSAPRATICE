package in.dsadec.com.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args)
    {
        int arr[]={6, 3, 10, 9, 2, 4, 9, 7};
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void countSort(int[] arr)
    {
        if(arr==null||arr.length==0 )
        {
            return;
        }
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        //System.out.println(max);
        int[] countArr = new int[max+1];
        for(int i:arr)
        {
            countArr[i]++;
        }
        //System.out.print(Arrays.toString(countArr));
        int index=0;
        for(int i=0;i<=max;i++)
        {
            while(countArr[i]>0)
            {
                arr[index]=i;
                index++;
                countArr[i]--;
            }
        }

    }

    public static class BubbleSort {
        public static void main(String[] args)
        {
            int arr[]={5,4,8,4,1};
            bubble(arr);
            print(arr);
        }
        static void print(int arr[]) {
           for(int i:arr)
           {
               System.out.print(i+" ");

           }
        }
        static void bubble(int arr[])
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        swap(arr,j,j+1);
                    }
                }
            }

        }
        static void swap(int arr[],int start,int end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
}

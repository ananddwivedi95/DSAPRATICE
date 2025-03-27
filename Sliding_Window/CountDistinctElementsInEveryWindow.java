package in.dsadec.com.Sliding_Window;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 1, 3, 4, 2, 3};
        System.out.println(countDistnictElement(arr,4));

    }
    static ArrayList<Integer> countDistnictElement(int[] arr,int k)
    {
        ArrayList<Integer> result=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        int i=0;
        int j=k-1;
        while(j<arr.length)
        {
            if(i<j)
            {
                hs.add(arr[i]);
                i++;
            }
            else if(i==j)
            {
                hs.add(arr[i]);
                result.add(hs.size());
                hs.clear();
                j++;
                i=j-(k-1);
            }
        }
        return result;
    }
}

package in.dsadec.com.TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInEveryWindowOfSizeK {
    public static void main(String[] args)
    {
        int arr[]={-8, 2, 3, -6, 10};
        System.out.println(FirstNegativeInteger(arr,2));

    }
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        // write code here
        ArrayList<Integer> ar= new ArrayList<>();
        int i=0;
        int j=k-1;
        while(j<arr.length)
        {
            if(i<=j&&arr[i]<0)
            {
                ar.add(arr[i]);
                j++;
                i=j-(k-1);
            }
            else if(i<j&&arr[i]>=0)
            {
                i++;
            }
            else if(i==j&&arr[i]>=0)
            {
                ar.add(0);
                j++;
                i=j-(k-1);
            }
        }
        return ar;
    }
}

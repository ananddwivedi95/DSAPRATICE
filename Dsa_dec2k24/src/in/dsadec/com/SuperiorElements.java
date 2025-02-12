package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.List;

public class SuperiorElements {
   public static void main(String[] arg)
   {
	   int ar[]= {18,
			   187 ,64, 133, 62,49, 163, 50 ,115, 42, 65, 60 ,49, 32, 87, 141, 142, 146, 159

};
	   speriorElemts(ar);
   }
   static List<Integer> speriorElemts(int[] arr)
   {
	   ArrayList<Integer> LL= new ArrayList<Integer>(); 
	   for(int i=0;i<arr.length;i++)
	   {   
		   boolean flag=true;
		   for(int j=i+1;j<arr.length;j++)
		   {   flag=true;
		       
			   if(arr[i]>arr[j])
			   {
				   flag=false;
			   }
			   else
			   {
				   break;
			   }
		   }
		   if(flag!=true)
		   {
			   System.out.println("hello");
			   LL.add(0,arr[i]);
		   }
		   
		   
	   }
	   LL.add(0,arr[arr.length-1]);
	   System.out.println(LL);
	   return LL;
   }
   
}

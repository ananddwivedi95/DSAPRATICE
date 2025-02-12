package Algo_Camp_DSA;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
   public static void main(String[] args)
   {
	   String arr[][]= {{"5","3",".",".","7",".",".",".","."}
			           ,{"6",".",".","1","9","5",".",".","."}
					   ,{".","9","8",".",".",".",".","6","."}
					   ,{"8",".",".",".","6",".",".",".","3"}
					   ,{"4",".",".","8",".","3",".",".","1"}
					   ,{"7",".",".",".","2",".",".",".","6"}
					   ,{".","6",".",".",".",".","2","8","."}
					   ,{".",".",".","4","1","9",".",".","5"}
					   ,{".",".",".",".","8",".",".","7","9"}};
	  System.out.println(validSuduKu(arr));
   }
   static boolean traversal(String arr[][],int sr,int er,int sc,int ec)
   {   //for row
	   Set<String> set= new HashSet<String>();
	   for(int i=sr;i<=er;i++)
	   {
		  for(int j=sc;j<=ec;j++)
		  {
			if(arr[i][j]==".")
			{
				continue;
			}
			if(set.contains(arr[i][j]))
			{
				return false;
			}
			set.add(arr[i][j]);
		  }
	   }
	   return true;
   }
   static boolean validSuduKu(String arr[][])
   { // for row
	   for(int row=0;row<9;row++)
	   {  
		   Set<String> set= new HashSet<String>();
		   for(int col=0;col<9;col++)
		   {
			   if(arr[row][col]==".")
			   {
				   continue;
			   }
			   if(set.contains(arr[row][col]))
			   {
				   return false;
			   }
			   set.add(arr[row][col]);
		   }
	   }
	   // for col
	   for(int row=0;row<9;row++)
	   {  
		   Set<String> set= new HashSet<String>();
		   for(int col=0;col<9;col++)
		   {
			   if(arr[col][row]==".")
			   {
				   continue;
			   }
			   if(set.contains(arr[col][row]))
			   {
				   return false;
			   }
			   set.add(arr[col][row]);
		   }
	   }
	   //for grid
	   int er=0;
	   int ec=0;
	   for(int sr=0;sr<9;sr+=3)
	   {
		   er=sr+2;
		   for(int sc=0;sc<9;sc+=3)
		   {
			   ec=sc+2;
			  boolean b =traversal(arr,sr,er,sc,ec);
			  if(b!=true)
			  {
				  return false;
			  }
		   }
		   
	   }
	   return true;
   }
}

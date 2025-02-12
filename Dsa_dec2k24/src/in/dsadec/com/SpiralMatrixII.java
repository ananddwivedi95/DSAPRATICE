package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SpiralMatrixII {
  public static void main(String[] args)
  {
	  spiralMatrix(3);
  }
  static void spiralMatrix(int n)
  {
	  int k=1;int mat[][]= new int[n][n];

	  ArrayList<Integer> ar=new ArrayList<Integer>();
      

      int top=0;
      int bottom=mat.length-1;
      int left=0;
      int right=mat.length-1;
   while(top<=bottom&&left<=right)
   {
	   while (top <= bottom && left <= right) {
           // Left -> Right
           for (int i = left; i <= right; i++) {
               mat[top][i] = k++;
           }
           top++;

           // Top -> Bottom
           for (int i = top; i <= bottom; i++) {
               mat[i][right] = k++;
           }
           right--;

           // Right -> Left
           if (top <= bottom) {
               for (int i = right; i >= left; i--) {
                   mat[bottom][i] = k++;
               }
               bottom--;
           }

           // Bottom -> Top
           if (left <= right) {
               for (int i = bottom; i >= top; i--) {
                   mat[i][left] = k++;
               }
               left++;
           }
       }
   }

}
}

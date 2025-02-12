package Algo_Camp_DSA;

public class PrintingThe2dArrayInTheWaveFormate {
    public static void main(String[] args) {
        int num[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = printingThe2dArrayInTheWaveFormate(num);

        // Print the 2D result array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] printingThe2dArrayInTheWaveFormate(int[][] num) {
        int numRows = num.length;
        int numCols = num[0].length;
        
        // Total number of elements in the wave
        int totalElements = numRows * numCols;
        
        // Calculate number of rows needed for the result 2D array
        int numWaveRows = (int) Math.ceil((double) totalElements / numCols);
        
        // Create the result 2D array
        int[][] waveArray = new int[numWaveRows][numCols];
        
        int index = 0; // index for filling the waveArray
        
        // Traverse each column
        for (int i = 0; i < numCols; i++) {
            if (i % 2 == 0) {
                // Traverse column top to bottom
                for (int j = 0; j < numRows; j++) {
                    if (index < totalElements) {
                        waveArray[index / numCols][index % numCols] = num[j][i];
                        index++;
                    }
                }
            } else {
                // Traverse column bottom to top
                for (int j = numRows - 1; j >= 0; j--) {
                    if (index < totalElements) {
                        waveArray[index / numCols][index % numCols] = num[j][i];
                        index++;
                    }
                }
            }
        }

        return waveArray;
    }
}

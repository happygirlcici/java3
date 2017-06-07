
package randarray;

import java.util.Random;

/**
 *
 * Declare an array of integers 3 rows and 4 columns
 * FIll in with random integers from 1-100 inclusive 
 * display the array in 3 lines with values comma-separed
 */
public class RandArray {

    
    
    public static void main(String[] args) {
        
        int[][] array = new int[3][4];
        System.out.println("new array");
    
        for (int j = 0; j < 4; j++) {
            Random random = new Random();
            int count = 0;
            //int myNumber;
            while (count < 3) 
            {
                int myrandom = (int) (Math.random() * 99 + 1);
                for (int i = 0; i < 3; i++) {
                    if (array[i][j] == 0) {
                        array[i][j] = myrandom;
                        count++;
                        break;
                    }
                    if (array[i][j] == myrandom) {
                        break;
                    }
                }
            }
        }
        
        // 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + ","+"\t");

                if ((i + 1) % 10 == 0) {
                    System.out.println("\n");
                }
            }
            System.out.println();
        }
        
    }
    
}

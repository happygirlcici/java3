
package randarray;

import java.util.Random;
import java.util.Scanner;

public class RandArray {

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows?");
        int rowCount = input.nextInt();
        System.out.print("How many lines?");
        int colCount = input.nextInt();
        System.out.print("Min num?");
        int minRand = input.nextInt();
        System.out.print("Max num?");
        int maxRand = input.nextInt();
        
        Random r= new Random();
        int randArray [][] = new int [rowCount][colCount];
        //int myrandom = (int) (Math.random() * maxRand + 1);
        
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++){
                randArray[row][col] = r.nextInt(maxRand-minRand+1) + minRand;
            }
        } 
      
        for (int row = 0; row < rowCount;row++){
            for (int col=0;col < colCount;col++ ){
            System.out.printf("%3d, ",randArray[row][col]);
            }
            System.out.println();
         }
        
    }
    
}

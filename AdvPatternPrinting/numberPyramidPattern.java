// Problem Statement: Print the following pattern:
//      1
//     2 2
//    3 3 3
//   4 4 4 4 
//  5 5 5 5 5

package AdvPatternPrinting;

public class numberPyramidPattern {
    public static void main(String[] args) {
        int rows=5;

        for(int i=1; i<=rows; i++){
            // loop for spaces
            for(int j=(rows-i); j>= 1; j--){
                System.out.print(" ");
            }

            // loop for numbers
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    
}

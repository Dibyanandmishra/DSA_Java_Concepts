// Problem Statement: Print the following pattern:
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *  
// * * * * * 

package AdvPatternPrinting;

public class solidRombusPattern {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=rows; i>=1; i--){

            // print rows-1 spaces
            for(int j=i; j>1; j--){
                System.out.print("  ");
            }

            // print * ==> number of rows
            for(int j=1;j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

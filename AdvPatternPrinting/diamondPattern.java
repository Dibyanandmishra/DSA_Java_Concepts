// Problem Statement: Print the following pattern:
//       * 
//     * * * 
//   * * * * * 
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * * 
//       * 

package AdvPatternPrinting;

public class diamondPattern {
    public static void main(String[] args) {
        int rows = 4;

        // upper part
        for(int i=1; i<=rows; i++){
            // loops for spaces
            for(int j=1; j<=(rows-i); j++){
                System.out.print("  ");
            }

            // loops for stars
            for(int j=1; j<=(2*i -1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for(int i=rows; i>=1; i--){
            // loops for spaces
            for(int j=1; j<=(rows-i); j++){
                System.out.print("  ");
            }

            // loops for stars
            for(int j=1; j<=(2*i -1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Problem Statement: Print the pattern:
//       *
//     * * 
//   * * * 
// * * * * 

package PatternPrinting;

public class fifthStarPattern {
    public static void main(String[] args) {
        int rows = 4;

        for(int i=0; i<rows; i++){
            for(int gap=0; gap<rows-(i+1); gap++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

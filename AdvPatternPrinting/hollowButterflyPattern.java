// Problem Statement: Print the following pattern:
// *             * 
// * *         * * 
// *   *     *   *
// *     * *     * 
// *     * *     *
// *   *     *   *
// * *         * *
// *             *

package AdvPatternPrinting;

public class hollowButterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        // UPPER PART
        for(int i = 1; i<=n; i++){
            int midGaps = 2*(n-i);

            // loop for upper starting part star
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            // for mid part gap between stars
            for(int j=1; j<=midGaps; j++){
                System.out.print("  ");
            }

            // loop for upper ending part star
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // LOWER PART
        for(int i = n; i>=1; i--){
            int midGaps = 2*(n-i);

            // loop for upper starting part star
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            // for mid part gap between stars
            for(int j=1; j<=midGaps; j++){
                System.out.print("  ");
            }

            // loop for upper ending part star
            for(int j=1; j<=i; j++){
                if (j==1 || j==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
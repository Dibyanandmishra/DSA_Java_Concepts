// Problem Statement: Print the following pattern:
// *             * 
// * *         * * 
// * * *     * * *
// * * * * * * * * 
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

package AdvPatternPrinting;

public class butterflyPattern {
    public static void main(String[] args) {
        int rows = 4;
        
        // upper half
        for(int i=1; i<=rows; i++){
            // 1st part starting stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // 2nd part spaces
            int spaces = 2*(rows-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            // 3rd part ending stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half
        for(int i=rows; i>=1; i--){
            // 1st part starting stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // 2nd part spaces
            int spaces = 2*(rows-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            // 3rd part ending stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
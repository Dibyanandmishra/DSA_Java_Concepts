// Problem Statement: Print the following pattern:
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4 
//  5 4 3 2 1 2 3 4 5

package AdvPatternPrinting;

public class palindromicNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1; i<=rows; i++){
            // loop for spaces
            for(int j=1; j<= (rows-i); j++){
                System.out.print("  ");
            }

            // loop for dec order numbers
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }

            // loop for inc order numbers
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Problem Statement: Print the following pattern:
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

package AdvPatternPrinting;

public class pascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Formula for Pascal's Triangle
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

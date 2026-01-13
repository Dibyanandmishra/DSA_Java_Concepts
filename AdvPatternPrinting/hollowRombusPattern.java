// Problem Statement: Print the following pattern:
//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * * 

package AdvPatternPrinting;

public class hollowRombusPattern {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=1; i<=rows; i++){
            // loop for spaces
            for(int j=1; j<= (rows -i); j++){
                System.out.print("  ");
            }

            // loop for stars
            if(i == 1 || i==rows){
                for(int k=1; k <=rows; k++){
                    System.out.print("* ");
                }
            }else{
                for(int k=1; k<= (rows-1); k++){
                    if(k==1 || k == (rows-1)) System.out.print("* ");

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

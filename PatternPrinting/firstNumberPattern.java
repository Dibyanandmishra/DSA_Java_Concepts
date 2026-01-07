// Problem Statement: Print the pattern:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

package PatternPrinting;

public class firstNumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}

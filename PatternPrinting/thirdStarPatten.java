// Problem Statement: Print the pattern:
// * 
// * * 
// * * * 
// * * * * 

package PatternPrinting;

public class thirdStarPatten {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;

        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

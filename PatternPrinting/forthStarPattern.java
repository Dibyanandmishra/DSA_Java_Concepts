// Problem Statement: Print the pattern:
// * * * * 
// * * * 
// * * 
// * 

package PatternPrinting;

public class forthStarPattern {
    public static void main(String[] args) {
        int rows = 4;

        for(int i=rows; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

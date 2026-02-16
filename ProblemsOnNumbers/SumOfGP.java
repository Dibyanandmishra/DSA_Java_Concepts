// Find the sum of GP series

package ProblemsOnNumbers;
import java.util.Scanner;

public class SumOfGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term of the series: ");
        double a = sc.nextInt();
        
        System.out.print("Enter the Value of Common Ratio: ");
        double r = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        double sum;

        if(r == 1){
            sum = a * n;
        }
        else{
            sum = (a * (Math.pow(r, n) - 1)) / (r-1);
        }

        System.out.print("The sum of the GP is: "+ sum );

        sc.close();
    }
}

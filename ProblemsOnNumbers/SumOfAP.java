// Find the sum of AP series

package ProblemsOnNumbers;
import java.util.Scanner;

public class SumOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term of the series: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the Value of Common difference: ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int sum = ( n * ((2*a) + ((n-1)*d)))/2 ;
        System.out.print("The sum of the AP is: "+ sum );

        sc.close();
    }
}
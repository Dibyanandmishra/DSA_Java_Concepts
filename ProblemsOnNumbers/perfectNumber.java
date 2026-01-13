// You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.
// A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.

package ProblemsOnNumbers;
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=(input/2); i++){
            if(input % i == 0){
                sum = sum + i;
            }
        }

        if (sum == input) {
            System.out.print("The number "+ input+" is a perfect number");
        }
        else{
            System.out.print("The number "+ input+" is not a perfect number");
        }
        sc.close();
    }
}

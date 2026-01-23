// Check whether a given number is positive or negative.

package ProblemsOnNumbers;
import java.util.Scanner;

public class CheckPostiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n==0){
            System.out.print(n+" is a neither positive nor negative number.");
        }
        else if(n>0){
            System.out.print(n+ " is a positive number.");
        }
        else{
            System.out.print(n+ " is a negative number.");
        }
        sc.close();
    }
}

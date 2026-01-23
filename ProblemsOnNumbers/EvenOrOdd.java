// Given an integer n. Check whether the number is Even Or Odd.

package ProblemsOnNumbers;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.print(n+ " is an even number");
        }
        else{
            System.out.print(n+ " is a odd number");
        }
        sc.close();
    }
}

// You are given an integer n. Return the value of n! or n factorial. 
// Factorial of a number is the product of all postive integers less than or equal to that number.

package ProblemsOnNumbers;
import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        if(num == 0 || num == 1){
            System.out.print("Factorial of "+ num +" is : "+ factorial);
        }
        else{
            for(int i=2; i<=num; i++){
                factorial = factorial*i;
            }
            System.out.print("Factorial of "+ num +" is : "+ factorial);
        }
        sc.close();
    }
}

// Convert Decimal number to Octal Number.

package ProblemsOnNumbers;
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        int octal = 0;
        int place = 1;

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal = octal + remainder * place;
            place = place * 10;
            decimal = decimal / 8;
        }

        System.out.println("Octal value: " + octal);
        sc.close();
    }
}

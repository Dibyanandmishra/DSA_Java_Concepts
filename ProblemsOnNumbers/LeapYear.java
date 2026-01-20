// Find a year is Leap Year or not.

package ProblemsOnNumbers;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if((year % 400 == 0 || year % 100 != 0 )&& (year%4 == 0) ){
            System.out.print(year +" is a Leap Year");
        }
        else{
            System.out.print(year +" is not a Leap Year");
        }
        sc.close();
    }
}

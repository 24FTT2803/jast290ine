import java.util.Scanner;
import java.util.Random;

public class IsPalindromeReverse {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed*10+digit;
            number/= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int number, int reverseinput) {
        return number == reverse(reverseinput);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int generated = rand.nextInt(900) + 100;
        System.out.print("Enter the reverse of " + generated + ": ");
        int userreverse = input.nextInt();

        while (userreverse < 100 || userreverse > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + generated + ": ");
            userreverse = input.nextInt();
        }

        boolean result = isPalindrome(generated, userreverse);
        System.out.println("The digit " + userreverse + " is palindrome of " + generated + " is " + result + ".");
    }
}

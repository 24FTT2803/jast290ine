import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int firstint = input.nextInt();

    System.out.print("Enter second integer: ");
    int secondint = input.nextInt();

    int greatestcommondivisior = findGCD(firstint, secondint);

    System.out.println("The greatest common divisor for " + firstint + " and " + secondint + " is " + greatestcommondivisior);
    }
}

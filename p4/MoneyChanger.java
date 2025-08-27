import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to convert bnd to rm and 2 vice versa: ");
        int options = input.nextInt();

        System.out.print("Enter the amount to be converted: $");
        double amount = input.nextDouble();
        double change;
        if (options == 1) {
            change = amount * 3;
        }
        else {
            change = amount / 3;
        }
        System.out.printf("The change is $%.2f\n", change);

    }
}

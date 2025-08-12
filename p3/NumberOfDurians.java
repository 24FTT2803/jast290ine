import java.util.Scanner;
public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double durian_price = 15.75;

        System.out.println("Each durian cost $"+durian_price);
        System.out.print("How much money do you have? $");

        double money = input.nextDouble();
        int numberofdurians = (int)(money / durian_price);

        System.out.println("The number of durians(s) you can buy is " + numberofdurians);

    }
}

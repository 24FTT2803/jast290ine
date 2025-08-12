import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 30;
        
        System.out.print("What is your target amount? $");
        double amount = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        int month = input.nextInt();

        double savings = amount / (month * day);
        System.out.printf("The amount you need to save per day is $%.2f", savings);
    }    
}
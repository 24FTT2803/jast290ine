import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,
        positive =0,
        negatives = 0,
        total = 0,
        count = 0;
        double average = 0;

        System.out.println("Enter integer, the input ends if it 0: ");
        while (true) {
            number = input.nextInt();

            if (number == 0)
            break;

            if (number > 0) 
            positive++;

            else negatives++;
            total = total + number;
            count++;
        }

        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program. ");
        } else {
            average = (double)total / count;
            System.out.println("The number of positive is "+ positive);
            System.out.println("The number of negatives is "+negatives);
            System.out.println("The total is "+total);
            System.out.println("The average is "+average);
        }

    }
}

import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer between 100 and 999: ");
        int integerno = input.nextInt();

        int digit1= integerno % 10;
        int digit2= (integerno / 10 ) % 10;
        int digit3= integerno / 100;

        int reversedno = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("The reversed of " + integerno + " is " + reversedno);

    }
}

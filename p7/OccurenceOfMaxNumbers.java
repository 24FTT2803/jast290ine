import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int count = 0;
        int number;

        System.out.println("Enter numbers (e.g 1 2 5 3 2), the input ends with 0 entered: ");
    while (true){
        number = input.nextInt();
        if (number==0)
        break;

        if (number == largest){
            count++;
        }
        else if (number > largest) {
            largest = number;
            count = 1;

        }
    }
    if (largest == Integer.MIN_VALUE) {
        System.out.println("0 were entered. ");
    }else {
        System.out.print("The largest number is " + largest);
        System.out.print("\nThe occurence count of the largest number is "+ count);
        
    }
    }
}

import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = i;

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }

        int chances = 10;
        while (chances > 0) {
            System.out.print("\nGuess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) guess[i] = input.nextInt();

            int score = 0;
            for (int i = 0; i < 4; i++)
                if (guess[i] == arr[i]) score++;

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                break;
            } else {
                chances--;
                if (chances == 0) {
                    System.out.print("\nThe actual number is: ");
                    for (int i = 0; i < 4; i++) System.out.print(arr[i] + " ");
                    System.out.println("\nYou Lose.");
                } else {
                    System.out.println("You have score " + score +
                                       " out of the 4 numbers. You have " +
                                       chances + " chances left.");
                }
            }
        }
    }
}

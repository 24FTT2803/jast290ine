import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int noofround =0, noofscore = 0, computerscore=0, enteredchoices, computerchoice;

        String replay = "y";
        String[] choice = {"rock","paper", "scissor"};

        while (replay.equals("y")) {
            System.out.println("Enter rock (0), paper (1), scissor (2): ");
            enteredchoices = input.nextInt();

            computerchoice = rand.nextInt(3);

            System.out.println("The computer is " +choice[computerchoice] +". You are "+ choice[enteredchoices] + ".");

            if (enteredchoices == computerchoice) {
                System.out.println("It is a draw.");
            } else if ((enteredchoices == 0 && computerchoice == 2) ||
                       (enteredchoices == 1 && computerchoice == 0) ||
                       (enteredchoices == 2 && computerchoice == 1)) {
                System.out.println("You win.");
                noofscore++;
            } else {
                System.out.println("You lose.");
                computerscore++;
            }

            noofround++;
            System.out.println("\nEnter y to play again: ");
            replay = input.next();
    }
    System.out.println("In the total of " + noofround + "rounds(s), You scored "+ noofscore+ ", Computer scored "+computerscore);
    if  (noofscore > computerscore){
        System.out.println("You won the game. ");

    }  else if (noofscore < computerscore){
        System.out.print("You lose the game. ");
        
    }  else {
        System.out.println("It is a draw game. ");
    }
        }
    }


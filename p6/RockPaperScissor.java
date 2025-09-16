import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int generateno = (int)(Math.random() * 1000) % 3;

        System.out.println("Enter rock(0), paper(1), scissor (2): ");
        int enterchoice = input.nextInt();

        String generatenoword ="";
        String enterchoiceword = "";

        if (generateno == 0) {
            generatenoword = "rock";
        } else if (generateno == 1){
            generatenoword= "paper";
        } else if (generateno == 2){
            generatenoword= "scissor";
        }

           if (enterchoice == 0) {
            enterchoiceword = "rock";
        } else if (enterchoice == 1){
            enterchoiceword = "paper";
        } else if (enterchoice == 2){
            enterchoiceword= "scissor";
        }
    
    if (enterchoice == 2 && generateno == 0 ){
        System.out.println("You Lose. ");
    }
    else if (enterchoice == 2 && generateno == 1 ){
        System.out.println("You Win. ");
    }
    else if (enterchoice == 1 && generateno == 2 ){
        System.out.println("You Lose. ");
    }
    else if (enterchoice == 1 && generateno == 0 ){
        System.out.println("You Win. ");
    }

    else if (enterchoice == 0 && generateno == 2 ){
        System.out.println("You Win. ");
    }
    else if (enterchoice == generateno){
        System.out.println("This is a draw.");
    }
     System.out.print("The computer is " + generatenoword + ". You are " + enterchoiceword + ".");
}
    }

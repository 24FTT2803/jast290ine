import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int no1 = (int)(Math.random() * 100);
        int no2 = (int)(Math.random() * 100);
        int no3 = (int)(Math.random() * 100);
        int no4 = (int)(Math.random() * 100);

        int sumofnoanswer = no1 + no2 + no3+ no4;
        System.out.println("What is "+no1 + " + " + no2 + " + " + no3 + " + " + no4 + "?");
        int sumofno= input.nextInt();

        if (sumofno == sumofnoanswer){
            System.out.println("Well done, you are correct!");

        } else {
            System.out.println("Nice try, the sum should be "+sumofnoanswer);
        }

    }
}

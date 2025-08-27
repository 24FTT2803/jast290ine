import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    {
        int no1 = (int)
        (Math.random() * 100);
        
        int no2 = (int)
        (Math.random() * 100);

        System.out.println("What is "+no1 + " + "+no2+ " ?");
        int additionans = input.nextInt();

        if (additionans == (no1 + no2)) {
            System.out.println(no1 + " +  " + no2+ " + " + " = "+ additionans + " is true");
        }
        else {
            System.out.println(no1 + " +  " + no2 + " = "+ additionans + " is false");
        }
    
        System.out.println("What is "+no1 + " % "+no2+ " ?");
        int modulus = input.nextInt();

        if (modulus == (no1 % no2)) {
            System.out.println(no1 + " %  " + no2+ " % " + " = "+ modulus + " is true");
        }
        else {
            System.out.println(no1 + " %  " + no2 + " = "+ modulus + " is false");
        }




        input.close();
}
}
}
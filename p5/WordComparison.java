import java.util.Scanner;

public class WordComparison {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first word: ");
    String firstword = input.nextLine();


    System.out.print("Enter the second word: ");
    String secword = input.nextLine();

    System.out.print("Are both words the same? ");
    String words = (firstword.equalsIgnoreCase(secword)) ? "True" : "False";
    System.out.print(words);
    
input.close();
}
}

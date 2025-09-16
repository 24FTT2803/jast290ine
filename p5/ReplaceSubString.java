import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String sentence = input.nextLine();
        System.out.print("Enter the substring to replace: ");
        String oldsubstring = input.nextLine();
        System.out.print("Enter the replacement string: ");
        String newsubstring = input.nextLine();

        String updatedms = sentence.replace(oldsubstring,newsubstring);
        System.out.print("The updated message is: "+updatedms);

        
        
    }
}

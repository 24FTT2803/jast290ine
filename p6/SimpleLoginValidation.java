import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String time = new SimpleDateFormat("HH:mm:ss").format (new Date());
        System.out.println("Please enter your username: ");
        String username = input.nextLine();
        System.out.println("Please enter the password:");
        String password = input.nextLine();


        if (username.equals("Ahmad Ali") && password.equals("12345")){
            System.out.println("Welcome "+username +". The time now is "+time);
        }
         else {
            if (!username.equals("Ahmad Ali")){
                System.out.println("Error: Invalid Username.");
            }
            else if(!password.equals("12345")){
                System.out.println("Error: Password does not match.");
            }
            else{
                System.out.println("Both user and password are incorrect");
            }
            
         }
    }
}

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        int no1 = input.nextInt();
        String calculator = input.next();
        int no2 = input.nextInt();

        switch (calculator){
            case "+":
            int add = (no1 + no2);
            System.out.print("The sum is "+ add);
            break;

            case "-":
            int sub = (no1 - no2);
            System.out.print("The subtraction is "+ sub);
            break;

            case "*":
            int multi = (no1 * no2);
            System.out.print("The multiply is "+ multi);
            break;

            case "/":
            if(no2 == 0){
            System.out.println("Math error: The divisor cannot be Zero");
            }
            else {
            int div = (no1 / no2);
                System.out.println("The division is "+ div);
            }
            break;
            default:
            System.out.println("Invalid operations");
            }
          
        }
    }


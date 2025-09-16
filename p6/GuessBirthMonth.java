import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month =0;
        System.out.println("is your birth month in Set 1? ");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No 1 for Yes: ");
        int set1 = input.nextInt();

        if (set1 == 1) month +=1;

        System.out.println("is your birth month in Set 2? ");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No 1 for Yes: ");
        int set2 = input.nextInt();

        if (set2 == 1) month +=2;

        System.out.println("is your birth month in Set 3? ");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No 1 for Yes: ");
        int set3 = input.nextInt();

        if (set3 == 1) month +=4;

        System.out.println("is your birth month in Set 4? ");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No 1 for Yes: ");
        int set4 = input.nextInt();

        if (set4 == 1) month +=8;

        String monthname = "";
        switch (month) {
            case 1: monthname = "January";
            break;
            case 2: monthname = "February";
            break;
            case 3: monthname = "March";
            break;
            case 4: monthname = "April";
            break;
            case 5: monthname = "May";
            break;
            case 6: monthname = "June";
            break;
            case 7: monthname = "July";
            break;
            case 8: monthname = "August";
            break;
            case 9: monthname = "September";
            break;
            case 10: monthname = "October";
            break;
            case 11: monthname = "November";
            break;
            case 12: monthname = "December";
            break;
        }
        System.out.println("You are born in "+monthname);
    }
}

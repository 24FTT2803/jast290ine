import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = input.nextLine().toUpperCase(); 

    String folderpath = "C:\\Users\\Nitro 5\\Desktop\\p5\\Practical 5";
     File folder = new File(folderpath);

    File file = new File(folderpath, "QReceipt.txt");
    FileWriter writer = new FileWriter(file, true);

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    Random randomno = new Random();
     int queueNo = randomno.nextInt(900) + 100;

    writer.write("Date & Time: " + now.format(format) + "\r\n");
    writer.write("Welcome " + name + "\r\n");
    writer.write("Your Queue Number: " + queueNo + "\r\n");
    writer.close();

System.out.println("Receipt generated. Thank you.");

    }

}

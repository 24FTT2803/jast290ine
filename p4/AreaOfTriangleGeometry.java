import java.util.Scanner;

public class AreaOfTriangleGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three coordinates for a triangles: ");

        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();

        double  side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double side = (side1 +side2+ side3)/2;
        double area = Math.sqrt((side - side1) * (side - side2) * (side - side3) * side);
        
        System.out.printf("The area of the triangle is %.1f\n", area);
    

    }
}

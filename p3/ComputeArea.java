public class ComputeArea {
    public static void main(String[] args) {

        double base = 4.0;
        double height = 6.0; 
        double pi = 3.14;
        double radius = 8.0;

        double Areaofsquare = base * base;
        double Areaoftriangle = 0.5 * base * height;
        double Areaofcircle = pi * radius * radius;

        System.out.println("The area of square is " +Areaofsquare + "\n" +
                          "The area of triangle is " +Areaoftriangle + "\n" +
                          "The area of circle is " +Areaofcircle);
        

}
}

    
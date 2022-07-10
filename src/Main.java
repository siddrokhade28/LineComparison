import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the X1 Coordinate");
        double x1= s.nextDouble();
        System.out.println("Enter the Y1 Coordinate");
        double y1= s.nextDouble();
        System.out.println("Enter the X2 Coordinate");
        double x2= s.nextDouble();
        System.out.println("Enter the Y2 Coordinate");
        double y2= s.nextDouble();

        double length = Math.sqrt(((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1)));
        System.out.println("length Between two points is "+length);
    }
}
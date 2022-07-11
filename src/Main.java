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

        Double length = Math.sqrt((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
        System.out.println("length Between two points is "+length);


        System.out.println("Enter the X1 Coordinate  for line 2");
        double x3= s.nextDouble();
        System.out.println("Enter the Y1 Coordinate for line 2");
        double y3= s.nextDouble();
        System.out.println("Enter the X2 Coordinate for line 2");
        double x4= s.nextDouble();
        System.out.println("Enter the Y2 Coordinate for line 2");
        double y4= s.nextDouble();

       Double length2 = Math.sqrt((Math.pow((x4-x3),2)+(Math.pow((y4-y3),2))));
        System.out.println("length Between two points is "+length2);

        if(length.compareTo(length2) >0){
            System.out.println("line 1 is greater");

        } else if (length.compareTo(length2)<0) {

            System.out.println("line 2 is greater");
        }
        else {
            System.out.println("lines are equal");
        }

        Integer abc = 123;
    }
}
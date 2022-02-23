package LineComparisonOOPS;
import java.util.Scanner;
public class LineComparisonOOPS {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.print("Enter End point of Line1:");
        double line1 = LengthCal();
        System.out.print("Enter End point of Line2:");
        double line2 = LengthCal();
        if (line1 == line2) {
            System.out.print("Lenght is Equal");
        } else {
            System.out.print("Lenght is Not Equal");
        }

    }

    static double LengthCal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point1's x=");
        int x1 = sc.nextInt();
        System.out.println("Enter Point1's y=");
        int y1 = sc.nextInt();
        System.out.println("Enter Point2's x=");
        int x2 = sc.nextInt();
        System.out.println("Enter Point2's y=");
        int y2 = sc.nextInt();
        sc.close();
        Double Length = Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2));
        return Length;
    }



}
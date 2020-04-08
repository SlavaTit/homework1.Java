package HomeworkLesson1Titarchuk;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Titarchuk_Parallelogram {
    public static void main(String[] args) {
        //S = a*b*sin(angle)
    Scanner gram = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = gram.nextDouble();
        System.out.print("Enter second side: ");
        double b = gram.nextDouble();
        System.out.print("Enter angle: ");
        double angle = gram.nextDouble();
        double radAngle = Math.toRadians(angle);
        double sinAngle = Math.sin(radAngle);
        if (a <= 0 || b <= 0 || angle <= 0 || angle >= 180 ) {
            System.out.println("Parallelogram does not exist");
        } else {
        double square = a * b * sinAngle;
        String changedSquare = new DecimalFormat("#0.00").format(square);
        System.out.println("Square: "+ changedSquare);
        }

    }
}

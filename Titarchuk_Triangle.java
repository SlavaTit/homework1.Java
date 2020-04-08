package HomeworkLesson1Titarchuk;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Titarchuk_Triangle {
    public static void main(String[] args) throws NumberFormatException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide the three sides of the triangle to calculate its area.");
        //Collection of data
        System.out.print("Enter first side: ");
        String a1 = scan.nextLine();
        System.out.print("Enter second side: ");
        String b1 = scan.nextLine();
        System.out.print("Enter third side: ");
        String c1 = scan.nextLine();
        if ((isNumber(a1)) && (isNumber(b1)) && (isNumber(c1))) {
            double a = Double.parseDouble(a1);
            double b = Double.parseDouble(b1);
            double c = Double.parseDouble(c1);
            if (a <= 0 || b <= 0 || c <= 0)
                System.out.println("Triangle does not exist");
            else if ((a + b <= c) || (a + c <= b) || (c + b <= a))
                System.out.println("Triangle does not exist");
            //Calculation of a half perimeter
            double p = (a + b + c) / 2;
            //Calculation of the triangle area
            double area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
            String areaTwo = new DecimalFormat("#0.00").format(area);
            //Result
            System.out.println("Area of a triangle: " + areaTwo);
        }        else { System.out.println("The triangle does not exist. Only numbers are accepted.");}
    }
    private static boolean isNumber(String str) throws NumberFormatException {
        for (char c: str.toCharArray()) {
            if (!Character.isDigit(c))   return false;
        }        return true;
    }
}

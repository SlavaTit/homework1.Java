package HomeworkLesson1Titarchuk;

import java.util.Scanner;

public class Titarchuk_StringToInt {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first digit ");
        String a = num.nextLine();
        System.out.print("Enter second digit ");
        String b = num.nextLine();
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int resultNum = numA + numB;
        String result = Integer.toString(resultNum);
        System.out.println("Sum: "+ result);
    }
}
